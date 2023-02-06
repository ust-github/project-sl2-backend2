package com.example.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Api(tags = "Controller")
@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
public class Controller {

    @ApiOperation("Greetings")
    @GetMapping(value = "/greetings", produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayQuote() {
        return "Your application has been deployed!";
    }

}
