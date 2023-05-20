package com.student.system.service;

import com.student.system.model.Student;
import com.student.system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    public StudentRepository repo;

    public List<Student> getAll(){
        return repo.findAll();
    }

    public Student saveStudent(Student std) {
        return repo.save(std);
    }
}
