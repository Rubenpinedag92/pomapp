package com.example.pomapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class TestController {
    
    @GetMapping("/hola")
    public String getMethodName() {

        return new String("Hola chavo");
    }
    
}
