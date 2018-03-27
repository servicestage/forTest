package com.service.afterupgrade.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-03-27T09:10:05.981Z")

@RestSchema(schemaId = "afterupgrade")
@RequestMapping(path = "/afterupgrade", produces = MediaType.APPLICATION_JSON)
public class AfterupgradeImpl {

    @Autowired
    private AfterupgradeDelegate userAfterupgradeDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userAfterupgradeDelegate.helloworld(name);
    }

}
