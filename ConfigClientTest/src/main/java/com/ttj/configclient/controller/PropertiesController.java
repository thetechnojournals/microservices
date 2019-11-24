package com.ttj.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class PropertiesController {
    @Value("${message}")
    private String message;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testMessage(){
        return message;
    }
}
