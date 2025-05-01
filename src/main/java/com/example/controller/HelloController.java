package com.example.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {


    @GetMapping("/hi")
    public String hi(){
        return "welcome Amazon";
    }

    @GetMapping("/jenkins")
    public String jenkin(){
        return "Welcome Jenkin";
    }

    @GetMapping("/aws")
    public String aws(){
        return "Aws Amazon";
    }

}
