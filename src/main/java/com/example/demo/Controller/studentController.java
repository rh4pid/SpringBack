package com.example.demo.Controller;


import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class studentController {

    @Autowired
    private StudentRepository studentRepository;


    @PostMapping("/add")
    public Student newStudent(@RequestBody Student newStudent){
        return studentRepository.save(newStudent);
    }

    @GetMapping("/retrieve")
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @GetMapping("/retrieve/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentRepository.findById(id).orElseThrow();
    }
}
