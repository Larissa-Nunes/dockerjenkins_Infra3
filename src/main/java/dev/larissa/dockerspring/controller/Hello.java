package dev.larissa.dockerspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello World";
    }
}
