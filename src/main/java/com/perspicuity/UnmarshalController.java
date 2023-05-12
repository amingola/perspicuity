package com.perspicuity;

import com.genologics.ri.container.Container;
import com.genologics.ri.project.Project;
import com.genologics.ri.sample.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.bind.JAXBException;

@Controller
@RequestMapping("/unmarshal")
public class UnmarshalController {

    //TODO AOP logging

    private static final Logger logger = LoggerFactory.getLogger(UnmarshalController.class);

    final UnmarshallingService unmarshallingService;

    public UnmarshalController(UnmarshallingService unmarshallingService) {
        this.unmarshallingService = unmarshallingService;
    }

    @PostMapping("/sample")
    ResponseEntity<Object> xmlToJsonSample(@RequestBody String xmlPayload){
        Sample jsonPayload = (Sample) xmlToJson(Sample.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/project")
    ResponseEntity<Object> xmlToJsonProject(@RequestBody String xmlPayload){
        Project jsonPayload = (Project) xmlToJson(Project.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    @PostMapping("/container")
    ResponseEntity<Object> xmlToJsonContainer(@RequestBody String xmlPayload){
        Container jsonPayload = (Container) xmlToJson(Container.class, xmlPayload);
        return buildResponse(jsonPayload);
    }

    private ResponseEntity<Object> buildResponse(Object jsonPayload) {
        return (jsonPayload != null)
                ? ResponseEntity.ok(jsonPayload)
                : ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    //@PostMapping("/**")
    private Object xmlToJson(Class<?> payloadClass, String xmlPayload){

        logger.info("\n" + xmlPayload);

        try {
            return UnmarshallingService.unmarshal(payloadClass, xmlPayload).getValue();
        } catch (JAXBException | ClassNotFoundException e) {
            logger.error("xmlToJson didn't work"); //TODO better handling
        }

        return null;

    }


}

