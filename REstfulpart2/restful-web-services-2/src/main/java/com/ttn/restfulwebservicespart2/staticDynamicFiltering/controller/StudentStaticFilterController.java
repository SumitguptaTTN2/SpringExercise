package com.ttn.restfulwebservicespart2.staticDynamicFiltering.controller;

import com.ttn.restfulwebservicespart2.staticDynamicFiltering.entity.Student;
import com.ttn.restfulwebservicespart2.staticDynamicFiltering.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentStaticFilterController {
    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/staticfilter/students")
    public HashMap getStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping(path = "/staticfilter/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        return studentService.getStudentById(studentId);
    }

    @PostMapping(path = "/staticfilter/students")
    public Student addStudents(@RequestBody Student student){
        return studentService.addNewStudent(student);
    }
}
