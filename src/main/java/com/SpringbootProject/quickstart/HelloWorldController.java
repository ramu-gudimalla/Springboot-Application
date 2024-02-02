package com.SpringbootProject.quickstart;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
    @GetMapping(path="/")
    public String helloWorld(){
        return "Hello";
    }
}
