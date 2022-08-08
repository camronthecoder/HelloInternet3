package com.careerdevs.HelloInternet2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PrivateKey;

@RestController
public class RootController {
    @GetMapping("/")
    private String routeRoute (){
        return "Your requested root";
    }
    @GetMapping("/hello")
    private String Hello (){
        return "hello career devs";
    }

}
