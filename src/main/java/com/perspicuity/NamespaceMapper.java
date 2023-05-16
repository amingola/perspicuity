package com.perspicuity;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NamespaceMapper extends NamespacePrefixMapper{

    private static final Logger logger = LoggerFactory.getLogger(NamespacePrefixMapper.class);
    private static final HashMap<String, Class<?>> classes = new HashMap<>();

    private final String clarityPackageRoot;
    private final HashMap<String, String> namespaces = new HashMap<>();

    @Autowired
    public NamespaceMapper(@Value("${packageRoot}") String clarityPackageRoot){
        this.clarityPackageRoot = clarityPackageRoot;
        initNamespaceMapFromSchemaDirectory();
        findAllClassesUsingClassLoader(clarityPackageRoot);
    }

    @Override
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {

        if(namespaceUri.isEmpty()){
            logger.debug("namespace was blank, returning \"\" - suggestion was \"" + suggestion + "\"");
            return suggestion;
        }

        String preferredPrefix = namespaces.get(namespaceUri);

        if(preferredPrefix != null){
            logger.debug("NM returning \"" + preferredPrefix + "\" - suggestion was \"" + suggestion + "\"");
            return preferredPrefix;
        }else{
            logger.debug("NM returning suggestion: \"" + suggestion + "\" - suggestion was \"" + suggestion + "\"");
            return suggestion;
        }

    }

    @Override
    public String[] getPreDeclaredNamespaceUris() {
        return new String[0];
    }

    public HashMap<String, Class<?>> getClarityClasses(){
        return classes;
    }

    /**
     * Grabs all the unique namespaces and their prefixes from all of the .xsds
     */
    private void initNamespaceMapFromSchemaDirectory() {

        //Read all the .xsds
        File schemaFolder = new File("src/main/xsd"); //TODO replace with property
        StringBuilder sb = new StringBuilder();

        //TODO error-handling
        Arrays.stream(schemaFolder.listFiles()).forEach(file -> {
            try {
                String text = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);
                sb.append(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        //TODO replace with property
        //Pattern grabs everything following a "xlmns" (namespace) tag involving the package root
        String rootNamespace = "http://genologics.com";
        Pattern p = Pattern.compile("xmlns:[a-z]+=\"http://genologics.com/ri(/)*[a-z]*\"");
        Matcher m = p.matcher(sb);

        while(m.find()){

            String match = m.group();
            String prefix = match.substring(match.indexOf("xmlns:") + 6, match.indexOf("="));
            String namespaceSuffix = match.substring(match.lastIndexOf(rootNamespace) + rootNamespace.length(), match.length() - 1);

            namespaces.put(rootNamespace + namespaceSuffix, prefix);

        }

        namespaces.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry -> logger.debug(entry.toString()));
        logger.debug(String.valueOf(namespaces.size()));

    }

    private void findAllClassesUsingClassLoader(String packageName) {

        String packageNameWithSlashes = packageName.replaceAll("[.]", "/");

        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream(packageNameWithSlashes);
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        List<String> lines = reader.lines().collect(Collectors.toList());
        for(String line : lines){

            //Add classes within package
            if(line.endsWith(".class")){

                Class<?> c = getClass(line, packageName);

                if(c != null){
                    try{
                        c.newInstance();
                    } catch(InstantiationException e){
                        logger.debug("Skipping " + c + " as it can not be instantiated (abstract, interface, enum, etc.)");
                        continue;
                    } catch(IllegalAccessException e){
                        logger.error("IllegalAccessException trying to register class:  " + c, e);
                        continue;
                    }

                    String sanitizedClassName = sanitizeClassName(c);
                    logger.debug("adding " + sanitizedClassName);
                    classes.put(sanitizedClassName, c);

                }

            //explore subpackages
            }else{
                findAllClassesUsingClassLoader(packageName + "." + line);
            }

        }

    }

    private Class<?> getClass(String className, String packageName) {
        try {
            return Class.forName(packageName + "." + className.substring(0, className.lastIndexOf('.')));
        } catch (ClassNotFoundException e) {
            logger.error("", e);
        }
        return null;
    }

    private String sanitizeClassName(Class<?> c) {
        return c.toString()
                .replace("class " + clarityPackageRoot + ".", "")
                .replaceAll("\\$", ".");
    }

}