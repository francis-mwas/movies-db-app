package com.fram.starwars.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationTestController {

    @GetMapping("/ping")
    public String testController(){
        return "Pong";
    }

}
