package com.student.system.controller;


import com.student.system.model.Student;
import com.student.system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    public StudentService service;

    @GetMapping("/getAll")
    public List<Student> getAll(){
        return service.getAll();
    }

    @PostMapping("/add")
    public Student saveStudent(@RequestBody Student std){
        return service.saveStudent(std);
    }

}
