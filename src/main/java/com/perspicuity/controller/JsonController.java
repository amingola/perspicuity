package com.perspicuity.controller;

import com.genologics.ri.sample.Sample;
import com.perspicuity.service.MarshallingService;
import com.perspicuity.NamespaceMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/json")
public class JsonController {

    private static final Logger logger = LoggerFactory.getLogger(JsonController.class);

    final MarshallingService marshallingService;
    final NamespaceMapper namespaceMapper;

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

}

