package com.odentJava.SpringBootWithService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory/components")
public class MessageController {
    @GetMapping("/employees")
    public String message(){
        return "Hello boss Judens!";
    }
}
