package com.perspicuity;

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
@RequestMapping("/marshal")
public class MarshalController {

    private static final Logger logger = LoggerFactory.getLogger(MarshalController.class);

    final MarshallingService marshallingService;

    public MarshalController(MarshallingService marshallingService) {
        this.marshallingService = marshallingService;
    }

    @PostMapping("/sample")
    ResponseEntity<String> xmlToJsonSample(@RequestBody Sample sample){
        logger.info("commence /marshal/sample");
        return marshal(sample.getClass(), sample);
    }

    @PostMapping("/project")
    ResponseEntity<String> xmlToJsonSample(@RequestBody Project project){
        logger.info("commence /marshal/project");
        return marshal(project.getClass(), project);
    }

    private ResponseEntity<String> marshal(Class<?> payloadClass, Object payload){

        try {

            String response = marshallingService.marshal(payloadClass, payload);
            return ResponseEntity.ok().body(response);

        } catch (JAXBException e) {

            logger.error("Something broke real bad...", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());

        } catch (ClassNotFoundException e) {

            String msg = "ClassNotFoundException...was this a Clarity datatype?: " + payloadClass;

            logger.error(msg, e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msg);

        }

    }

}

