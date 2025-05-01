package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/bye")
public class ByeController {

    @GetMapping("/hi")
    public String bye(){
        return "BYE BYE";
    }
}
