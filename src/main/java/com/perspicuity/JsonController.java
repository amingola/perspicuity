package com.perspicuity;

import com.genologics.ri.sample.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/json")
public class JsonController {

    private static final Logger logger = LoggerFactory.getLogger(JsonController.class);

    private final String template =
            "\n    @GetMapping(\"/%1$s\")\n" +
                    "    ResponseEntity<String> get%2$s() throws JAXBException, ClassNotFoundException {\n" +
                    "        logger.info(\"commence /xml/%1$s\");\n" +
                    "        return ResponseEntity.ok(marshallingService.marshal(%1$s.class, new %1$s()));\n" +
                    "    }\n";

    final MarshallingService marshallingService;
    final NamespaceMapper namespaceMapper;

    @Value("${packageRoot}")
    private String clarityPackageRoot;

    @Autowired
    public JsonController(MarshallingService marshallingService, NamespaceMapper namespaceMapper) {
        this.marshallingService = marshallingService;
        this.namespaceMapper = namespaceMapper;
    }

    @GetMapping("/sample")
    ResponseEntity<Sample> getSample(){
        logger.info("commence /json/sample");
        return ResponseEntity.ok(new Sample());
    }

    @GetMapping("/all")
    ResponseEntity<Sample> printAllEndpoints(){

        logger.info("commence /json/all");
        //findAllClassesUsingClassLoader("com.genologics.ri");

        namespaceMapper.getClarityClasses().forEach((cName, c) ->{

            //Skip ObjectFactory classes; they don't get sent to Clarity and they result infinite loops when marshalled
            String[] dirLevels = cName.split("\\.");
            if(!dirLevels[dirLevels.length - 1].equals("ObjectFactory")){

                String titleCaseType = sanitizeType(cName);
                String fullTypeName = clarityPackageRoot + "." + cName;

                System.out.printf(template, fullTypeName, titleCaseType);

            }

        });

        return ResponseEntity.ok(new Sample());

    }

    private String sanitizeType(String type){
        return Arrays.stream(type.split("\\."))
                .map(x -> x.substring(0,1).toUpperCase() + x.substring(1))
                .collect(Collectors.joining(""));
    }

}

