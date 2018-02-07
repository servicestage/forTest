package com.service.testgit.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-02-07T16:17:41.509Z")

@RestSchema(schemaId = "fortest")
@RequestMapping(path = "/testgit", produces = MediaType.APPLICATION_JSON)
public class FortestImpl {

    @Autowired
    private FortestDelegate userFortestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userFortestDelegate.helloworld(name);
    }

}