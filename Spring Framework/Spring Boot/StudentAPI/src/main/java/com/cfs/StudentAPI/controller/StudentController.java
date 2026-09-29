package com.cfs.StudentAPI.controller;

import com.cfs.StudentAPI.model.Student;
import com.cfs.StudentAPI.service.CourseService;
import com.cfs.StudentAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    //@Autowired ->1. through field injection
    private StudentService studentService;

    //Jo mandatory DI usse constructor m likhte h
    @Autowired //3. for Di through constructor
    public StudentController(StudentService studentService) {
        this.studentService = studentService;

    }

//    //@Autowired ->2. through setter injection
//    public void setService(StudentService service) {
//        this.service = service;
//    }

    private CourseService courseService;

    //Optional DI ko setter m likhte h
    @Autowired(required = false)
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/all")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id){

        Student student = studentService.getStudentById(id);
        if (student == null){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(student);
    }
}
