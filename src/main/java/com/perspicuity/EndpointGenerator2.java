//package com.perspicuity;
//
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class EndpointGenerator2 {
//
////    private static final Logger logger = LoggerFactory.getLogger(EndpointGenerator.class);
//
//    private static final String clarityPackageRoot = "com.genologics.ri";
//    private static final String template =
//            "\n    @GetMapping(\"/%1$s\")\n" +
//            "    ResponseEntity<String> get%2$s() throws JAXBException, ClassNotFoundException {\n" +
//            "        logger.info(\"commence /xml/%1$s\");\n" +
//            "        return ResponseEntity.ok(marshallingService.marshal(%1$s.class, new %1$s()));\n" +
//            "    }\n";
//
//    public static void main(String[] args){
//
//        System.out.println("//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////" +
//                "//////////////////////////////////////////////////////////////////////////////////////");
//        findAllClassesUsingClassLoader(clarityPackageRoot).forEach((cName, c) ->{
//
//            //Skip ObjectFactory classes; they don't get sent to Clarity and they result infinite loops when marshalled
//            String[] dirLevels = cName.split("\\.");
//            if(!dirLevels[dirLevels.length - 1].equals("ObjectFactory")){
//
//                String titleCaseType = sanitizeType(cName);
//                String fullTypeName = clarityPackageRoot + "." + cName;
//
//                System.out.printf(template, fullTypeName, titleCaseType);
//
//            }
//
//        });
//
//    }
//
//    private static Map<String, Class<?>> findAllClassesUsingClassLoader(String packageName) {
//
//        Map<String, Class<?>> classes = new HashMap<>();
//        String packageNameWithSlashes = packageName.replaceAll("[.]", "/");
//
//        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream(packageNameWithSlashes);
//        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
//
//        List<String> lines = reader.lines().collect(
//                Collectors.toList());
//        for(String line : lines){
//
//            //Add classes within package
//            if(line.endsWith(".class")){
//
//                Class<?> c = getClass(line, packageName);
//
//                if(c != null){
//                    try{
//                        c.newInstance();
//                    } catch(InstantiationException e){
////                        logger.info("Skipping " + c + " as it can not be instantiated (abstract, interface, enum, etc.)");
//                        continue;
//                    } catch(IllegalAccessException e){
////                        logger.error("IllegalAccessException trying to register class:  " + c, e);
//                        continue;
//                    }
//
//                    String sanitizedClassName = sanitizeClassName(c);
//                    System.out.println("adding " + sanitizedClassName);
//                    classes.put(sanitizedClassName, c);
//
//                }
//
//                //explore subpackages
//            }else{
//                findAllClassesUsingClassLoader(packageName + "." + line);
//            }
//
//        }
//
//        return classes;
//
//    }
//
//    private static Class<?> getClass(String className, String packageName) {
//        try {
//            return Class.forName(packageName + "." + className.substring(0, className.lastIndexOf('.')));
//        } catch (ClassNotFoundException e) {
////            logger.error("", e);
//        }
//        return null;
//    }
//
//    private static String sanitizeType(String type){
//        return Arrays.stream(type.split("\\."))
//                .map(x -> x.substring(0,1).toUpperCase() + x.substring(1))
//                .collect(Collectors.joining(""));
//    }
//
//    private static String sanitizeClassName(Class<?> c) {
//        return c.toString()
//                .replace("class " + clarityPackageRoot + ".", "")
//                .replaceAll("\\$", ".");
//    }
//
//}
