package com.example.demo.Controller;


import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;
import jakarta.persistence.PostUpdate;
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

    @GetMapping("/login")
    public String login(){
        return "It worked";
    }

    @GetMapping("/retrieve/{id}")
    public Student getStudentById(@PathVariable Long id){
        return studentRepository.findById(id).orElseThrow();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return "Student with ID " + id + " deleted successfully.";
        } else {
            return "Student not found.";
        }
    }

    @PutMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, @RequestBody Student newData){
        if(studentRepository.existsById(id)){
            studentRepository.
        }
    }

}
