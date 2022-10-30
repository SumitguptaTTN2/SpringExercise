package com.ttn.restfulwebservicespart2.staticDynamicFiltering.controller;

import com.ttn.restfulwebservicespart2.staticDynamicFiltering.entity.Student;
import com.ttn.restfulwebservicespart2.staticDynamicFiltering.service.StudentService;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/DynamicFilter")
public class StudentDynamicFilterController {
    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/student")
    public MappingJacksonValue getStudents(){
        HashMap myBean = studentService.getAllStudents();
        return dynamicFilter(myBean);
    }

    @GetMapping(path = "/student/{studentId}")
    public MappingJacksonValue getStudentById(@PathVariable int studentId){
        Student student = studentService.getStudentById(studentId);
        return dynamicFilter(student);
    }

    @PostMapping(path = "/students")
    public MappingJacksonValue addStudents(@RequestBody Student student){
        Student newStudent = studentService.addNewStudent(student);
        return dynamicFilter(newStudent);
    }

    private MappingJacksonValue dynamicFilter(Object obj){
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(obj);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("studentName", "studentId", "studentEmail");
        FilterProvider filters = new SimpleFilterProvider().addFilter("Bean", filter);
        mappingJacksonValue.setFilters(filters);
        return mappingJacksonValue;
    }
}
