package com.nour.devops.devops;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/")
    public String home() {
        return "Hello, !";
    }
}


