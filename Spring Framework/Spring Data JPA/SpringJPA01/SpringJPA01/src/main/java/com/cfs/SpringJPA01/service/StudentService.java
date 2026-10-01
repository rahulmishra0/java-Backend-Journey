package com.cfs.SpringJPA01.service;

import com.cfs.SpringJPA01.entity.Student;
import com.cfs.SpringJPA01.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public List<Student> getAllStudentData(){
        List<Student> all = studentRepo.findAll();
        return all;
    }

    public Student saveStudent(Student student){
        return studentRepo.save(student);
    }

    public Student getStudentById(Long id){
        return studentRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Student not found"));
    }

    public void deleteStudent(Long id){
        studentRepo.deleteById(id);
    }
}
