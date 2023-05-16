package com.perspicuity.controller;

import com.genologics.ri.Links;
import com.genologics.ri.artifact.Artifacts;
import com.genologics.ri.artifact.Details;
import com.genologics.ri.project.Project;
import com.genologics.ri.sample.Sample;
import com.perspicuity.service.MarshallingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

    /*@GetMapping("/give-project")
    ResponseEntity<String> getRandomProject(){
        EasyRandom er = new EasyRandom();
        return marshal(Project.class, er.nextObject(Project.class));
    }*/

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

        @PostMapping("/links")
        ResponseEntity<String> xmlToJsonSample(@RequestBody Links project){
            logger.info("commence /marshal/project");
            return marshal(project.getClass(), project);
        }

    @PostMapping("/artifacts/batch/retrieve")
    ResponseEntity<String> artifactsBatchRetrieve(@RequestBody com.genologics.ri.artifact.Details details){
        logger.info("commence /artifacts/batch/retrieve");
        return marshal(details.getClass(), details);
    }

    @PostMapping("/artifactgroup")
    ResponseEntity<String> artifactgroup(@RequestBody com.genologics.ri.artifact.Artifactgroup artifactgroup){
        logger.info("commence /artifactgroup");
        return marshal(artifactgroup.getClass(), artifactgroup);
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

