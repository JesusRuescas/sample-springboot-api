package com.springboot.api.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping(value = "/wolrd")
    public String getHelloWolrd() {
        return "Hello Wolrd!";
    }

    @GetMapping(value = "/api")
    public String getHelloApi() {
        return "Hello API!";
    }

}
