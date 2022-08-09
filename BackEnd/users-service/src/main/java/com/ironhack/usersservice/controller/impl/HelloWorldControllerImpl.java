package com.ironhack.usersservice.controller.impl;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class HelloWorldControllerImpl {

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world";
    }

}
