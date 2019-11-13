package com.javakc.springboot1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("hello")
    public String hello(){
        System.out.println("spring boot hello");
        return "hello";
    }
}
