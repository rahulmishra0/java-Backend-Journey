package com.cfs.SpringBootP02.controller;

import com.cfs.SpringBootP02.model.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return new Student(101, "Priya", 88);
    }

    @GetMapping("/student/{id}")
    public String getStudentById(@PathVariable int id){
        return "Student id is "+id;
    }

    @GetMapping("/student/search")
    public String searchStudent(@RequestParam String course){
        return "Search Student for course "+course;
    }

    @GetMapping("/product/search")
    public String searchProduct(@RequestParam String cate, @RequestParam double minPrice){
        return "Product "+cate+" Price "+minPrice;
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<String> getStudent(@PathVariable int id){

        if (id<0){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Invalid student id");
        }

        return ResponseEntity.ok("Student found");
    }
}
