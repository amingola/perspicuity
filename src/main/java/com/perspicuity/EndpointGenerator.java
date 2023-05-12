package com.perspicuity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EndpointGenerator {

    private static final Logger logger = LoggerFactory.getLogger(EndpointGenerator.class);

    private static final String clarityPackageRoot = "com.genologics.ri";

    private static final String fileBeginning =
            "package com.perspicuity;\n" +
                    "\n" +
                    "import org.slf4j.Logger;\n" +
                    "import org.slf4j.LoggerFactory;\n" +
                    "import org.springframework.http.ResponseEntity;\n" +
                    "import org.springframework.stereotype.Controller;\n" +
                    "import org.springframework.web.bind.annotation.GetMapping;\n" +
                    "import org.springframework.web.bind.annotation.RequestMapping;\n" +
                    "\n" +
                    "import javax.xml.bind.JAXBException;\n" +
                    "\n" +
                    "@Controller\n" +
                    "@RequestMapping(\"/xml\")\n" +
                    "public class XmlController {\n" +
                    "\n" +
                    "    private static final Logger logger = LoggerFactory.getLogger(XmlController.class);\n" +
                    "\n" +
                    "    final MarshallingService marshallingService;\n" +
                    "\n" +
                    "    public XmlController(MarshallingService marshallingService) {\n" +
                    "        this.marshallingService = marshallingService;\n" +
                    "    }";

    private static final String fileEnd = "\n}";

    private static final String endpointTemplate =
            "\n    @GetMapping(\"/%1$s\")\n" +
            "    ResponseEntity<String> get%2$s() throws JAXBException, ClassNotFoundException {\n" +
            "        System.out.println(\"commence /xml/%1$s\");\n" +
            "        return ResponseEntity.ok(marshallingService.marshal(%1$s.class, new %1$s()));\n" +
            "    }\n";

    public static void main(String[] args){

        logger.info("Generating endpoints for all instantiable JAXB classes");

        System.out.println(fileBeginning);

        //Read all the .xsds
        File schemaFolder = new File("target/generated-sources/jaxb/com/genologics/ri");

        Arrays.stream(schemaFolder.listFiles()).forEach(file -> {
            try {
                if(file.isDirectory()){
                    Arrays.stream(file.listFiles()).forEach(f -> {
                        if(!f.getName().contains("ObjectFactory")) {
                            try {
                                extractClassName(f);
                            } catch (IOException e) {
                                logger.error("Error extracting class name from " + f.getPath(), e);
                            }
                        }else{
//                            logger.info("Skipping " + f.getPath());
                        }
                    });
                }else{
                    if(!file.getName().contains("ObjectFactory")){
                        extractClassName(file);
                    }else{
//                        logger.info("Skipping " + file.getPath());
                    }
                }
            } catch (IOException e) {
                logger.error("Error extracting class name from " + file.getPath(), e);
            }
        });

        System.out.println(fileEnd);

    }

    private static void extractClassName(File file) throws IOException {

        String text = new String(Files.readAllBytes(file.toPath()), StandardCharsets.UTF_8);

        //Regex pattern for all instantiable classes;
        //guaranteed 1-class per file + INSTANTIABLE inner classes ONLY (no abstract, interface, enum, non-public)
        Pattern p = Pattern.compile("(public (static )*class )([a-zA-Z]+)");
        Matcher m = p.matcher(text);
        String path = file.getPath();

        while (m.find()) {

            String match = m.group();

            //Cut the path down to the relative path, replace backslashes with dots, and drop ".java" extension
            String fullTypeName =
                    path.substring(path.indexOf("com"))
                            .replaceAll("\\\\", ".")
                            .replaceAll("\\.java", "");

            String[] classRelativePath = fullTypeName.split("\\.");

            //Remove filename from the end of the path and add the name of the class matched with the regex pattern
            if(match.contains("static")){
                match = match.substring(match.lastIndexOf(" ") + 1);
                classRelativePath[classRelativePath.length - 1] = classRelativePath[classRelativePath.length - 1] + "." + match;
            }

            fullTypeName = String.join(".", classRelativePath);

            String titleCaseType = sanitizeType(fullTypeName);

//            System.out.println(fullTypeName);
            System.out.printf(endpointTemplate, fullTypeName, titleCaseType);

        }

    }

    private static String sanitizeType(String type){

        String str = type.replace(clarityPackageRoot + ".", "");

        return Arrays.stream(str.split("\\."))
                .map(x -> x.substring(0,1).toUpperCase() + x.substring(1))
                .collect(Collectors.joining(""));

    }


}
