package com.cfs.SpringBootP02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController    //->use to make this class as spring Bean
public class HelloController {

    @GetMapping("/hello")  //->use for http request
    public String sayHello(){
        return "Hello Spring Boot";
    }
    @GetMapping("/students")
    public List<String> getStudents(){
        return List.of("Rahul", "Priya", "Shreya");
    }
}
