package com.lzc.api.config.web.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = {"testApi"})
public class TestApiController {

    @RequestMapping(value="get/{id}",method = RequestMethod.GET)
    public String get(@PathVariable(value="id") String id){
        return "123";
    }
}
