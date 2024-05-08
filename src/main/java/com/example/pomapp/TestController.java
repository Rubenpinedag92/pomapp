package com.example.pomapp;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {
    
    @GetMapping("hola")
    public String getMethodName(@RequestParam String param) {
        return new String("Hola chavo");
    }
    
}