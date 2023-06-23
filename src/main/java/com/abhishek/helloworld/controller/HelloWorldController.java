package com.abhishek.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class HelloWorldController {

    @GetMapping
    public String welcome(){
        return "Welcome to the hello-world project";
    }
}
