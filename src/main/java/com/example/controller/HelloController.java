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



    @GetMapping("/third")
    public String third(){
        return "Third app";
    }

    @GetMapping("/aws")
    public String aws(){
        return "Aws Amazon";
    }

>>>>>>> d3b16c1085a234413305b601f5723a4d928e1e7b
}
