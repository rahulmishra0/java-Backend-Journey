package com.cfs.SpringBootP02.controller;

import com.cfs.SpringBootP02.dto.StudentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentPost {

    @PostMapping("/create")
    public String createStudent(@RequestBody StudentRequest request){
        return "Student created : "+request.getName;
    }

}
