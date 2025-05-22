package com.bandaljudens.BandalJudensSpringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Massage {
    @GetMapping("/getMessage")
    public String getMessage(){
        return "Ang Cute kooooo!";
    }
}
