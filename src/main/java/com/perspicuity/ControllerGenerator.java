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

public class ControllerGenerator {

    private static final Logger logger = LoggerFactory.getLogger(ControllerGenerator.class);
    private static final String clarityPackageRoot = "com.genologics.ri";

    private static final String jsonControllerName = "JsonController";
    private static final String jsonEndpointPathPrefix = "json";
    private static final String jsonControllerPath = "src/main/java/com/perspicuity/controller/" + jsonControllerName + ".java";
    private static final String jsonFileBeginning =
            "package com.perspicuity.controller;\n\n" +
            "import com.perspicuity.service.MarshallingService;\n" +
            "import org.slf4j.Logger;\n" +
            "import org.slf4j.LoggerFactory;\n" +
            "import org.springframework.http.HttpStatus;\n" +
            "import org.springframework.http.ResponseEntity;\n" +
            "import org.springframework.stereotype.Controller;\n" +
            "import org.springframework.web.bind.annotation.PostMapping;\n" +
            "import org.springframework.web.bind.annotation.RequestBody;\n" +
            "import org.springframework.web.bind.annotation.RequestMapping;\n\n" +
            "@Controller\n" +
            "@RequestMapping(\"/%2$s\")\n" +
            "public class JsonController {\n\n" +
            "    private static final Logger logger = LoggerFactory.getLogger(JsonController.class);\n\n" +
            "    final MarshallingService marshallingService;\n\n" +
            "    public JsonController(MarshallingService marshallingService) {\n" +
            "        this.marshallingService = marshallingService;\n" +
            "    }\n";
    private static final String jsonEndpointTemplate =
                    "\n    @PostMapping(\"/%1$s\")\n" +
                    "    ResponseEntity<Object> get%2$s(@RequestBody String xmlPayload) {\n" +
                    "        logger.info(\"hit /%3$s/%1$s\");\n" +
                    "        %1$s jsonPayload = (%1$s) xmlToJson(%1$s.class, xmlPayload);\n" +
                            "        return buildResponse(jsonPayload);\n" +
                    "    }\n";
    private static final String jsonFileEnd =
            "    private ResponseEntity<Object> buildResponse(Object jsonPayload) {\n" +
                    "        return (jsonPayload != null)\n" +
                    "                ? ResponseEntity.ok(jsonPayload)\n" +
                    "                : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();\n" +
                    "    }\n\n" +
                    "    private Object xmlToJson(Class<?> payloadClass, String xmlPayload){\n\n" +
                    "        logger.info(\"\\n\" + xmlPayload);\n\n" +
                    "        try {\n" +
                    "            return UnmarshallingService.unmarshal(payloadClass, xmlPayload).getValue();\n" +
                    "        } catch (JAXBException | ClassNotFoundException e) {\n" +
                    "            logger.error(\"xmlToJson didn't work for payload: \" + xmlPayload, e);\n" +
                    "        }\n\n" +
                    "        return null;\n\n" +
                    "    }\n\n" +
                    "}\n";

    private static final String xmlControllerName = "XmlController";
    private static final String xmlEndpointPathPrefix = "xml";
    private static final String xmlControllerPath = "src/main/java/com/perspicuity/controller/" + xmlControllerName + ".java";
    private static final String xmlFileBeginning =
                    "package com.perspicuity.controller;\n\n" +
                    "import com.perspicuity.service.MarshallingService;\n" +
                    "import org.slf4j.Logger;\n" +
                    "import org.slf4j.LoggerFactory;\n" +
                    "import org.springframework.http.HttpStatus;\n" +
                    "import org.springframework.http.ResponseEntity;\n" +
                    "import org.springframework.stereotype.Controller;\n" +
                    "import org.springframework.web.bind.annotation.PostMapping;\n" +
                    "import org.springframework.web.bind.annotation.RequestBody;\n" +
                    "import org.springframework.web.bind.annotation.RequestMapping;\n\n" +
                    "import javax.xml.bind.JAXBException;\n\n" +
                    "@Controller\n" +
                    "@RequestMapping(\"/%2$s\")\n" +
                    "public class %1$s {\n\n" +
                    "    private static final Logger logger = LoggerFactory.getLogger(%1$s.class);\n\n" +
                    "    final MarshallingService marshallingService;\n\n" +
                    "    public %1$s(MarshallingService marshallingService) {\n" +
                    "        this.marshallingService = marshallingService;\n" +
                    "    }";
    private static final String xmlEndpointTemplate =
                    "\n\n    @PostMapping(\"/%3$s/%2$s\")\n" +
                    "    ResponseEntity<String> xmlToJsonSample(@RequestBody %1$s %2$s){\n" +
                    "        logger.info(\"hit /marshal/%1$s\");\n" +
                    "        return marshal(%2$s.getClass(), %2$s);\n" +
                    "    }";
    private static final String xmlFileEnd = "\n\n" +
            "    private ResponseEntity<String> marshal(Class<?> payloadClass, Object payload){\n" +
            "\n" +
            "        try {\n" +
            "\n" +
            "            String response = marshallingService.marshal(payloadClass, payload);\n" +
            "            return ResponseEntity.ok().body(response);\n" +
            "\n" +
            "        } catch (JAXBException e) {\n" +
            "\n" +
            "            logger.error(\"Something broke real bad...\", e);\n" +
            "            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());\n" +
            "\n" +
            "        } catch (ClassNotFoundException e) {\n" +
            "\n" +
            "            String msg = \"ClassNotFoundException...was this a Clarity datatype?: \" + payloadClass;\n" +
            "\n" +
            "            logger.error(msg, e);\n" +
            "            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "    }\n}";

    private static final ArrayList<String> jaxbClasses = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        logger.info("Generating endpoints for all instantiable JAXB classes...");

        extractAllInstantiableJaxbClassesFromGeneratedSources();
        generateJsonController();
        generateXmlController();

    }

    private static void generateJsonController() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(jsonControllerPath));
        bufferedWriter.write(String.format(jsonFileBeginning, jsonControllerName, jsonEndpointPathPrefix));

        jaxbClasses.forEach(fullTypeName -> {
            try {
                String endpoint = String.format(jsonEndpointTemplate, fullTypeName, setToTitleCase(fullTypeName), jsonEndpointPathPrefix);
                bufferedWriter.write(endpoint);
            } catch (IOException e) {
                logger.error("Failed to create JSON endpoint for class \"" + fullTypeName, e);
            }
        });

        bufferedWriter.write(jsonFileEnd);
        bufferedWriter.close();

    }

    private static void generateXmlController() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(xmlControllerPath));
        bufferedWriter.write(String.format(xmlFileBeginning, xmlControllerName, xmlEndpointPathPrefix));

        jaxbClasses.forEach(fullTypeName -> {
            try {
                String endpoint =
                        String.format(xmlEndpointTemplate, fullTypeName, setToTitleCase(fullTypeName).toLowerCase(), xmlEndpointPathPrefix);
                bufferedWriter.write(endpoint);
            } catch (IOException e) {
                logger.error("Failed to create XML endpoint for class \"" + fullTypeName, e);
            }
        });

        bufferedWriter.write(xmlFileEnd);
        bufferedWriter.close();

    }

    private static void extractAllInstantiableJaxbClassesFromGeneratedSources() {

        //Read all the .xsds
        File schemaFolder = new File("target/generated-sources/jaxb/com/genologics/ri");

        Arrays.stream(Objects.requireNonNull(schemaFolder.listFiles())).forEach(file -> {
            try {
                if(file.isDirectory()){
                    Arrays.stream(Objects.requireNonNull(file.listFiles())).forEach(f -> {
                        if(!f.getName().contains("ObjectFactory")) {
                            try {
                                extractClassName(f);
                            } catch (IOException e) {
                                logger.error("Error extracting class name from " + f.getPath(), e);
                            }
                        }else{
                            logger.info("Skipping ObjectFactory class " + f.getPath());
                        }
                    });
                }else{
                    if(!file.getName().contains("ObjectFactory")){
                        extractClassName(file);
                    }else{
                        logger.info("Skipping ObjectFactory class " + file.getPath());
                    }
                }
            } catch (IOException e) {
                logger.error("Error extracting class name from " + file.getPath(), e);
            }
        });

        Collections.sort(jaxbClasses); //should be sorted already due to reading from filesystem, but enforce sorting

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
            jaxbClasses.add(fullTypeName);

        }

    }

    private static String setToTitleCase(String type){

        String str = type.replace(clarityPackageRoot + ".", "");

        return Arrays.stream(str.split("\\."))
                .map(x -> x.substring(0,1).toUpperCase() + x.substring(1))
                .collect(Collectors.joining(""));

    }


}
