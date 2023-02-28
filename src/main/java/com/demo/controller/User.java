package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {
    @GetMapping(value = "/user")
    public String getUser(){
        return "Hello user";
    }
}
