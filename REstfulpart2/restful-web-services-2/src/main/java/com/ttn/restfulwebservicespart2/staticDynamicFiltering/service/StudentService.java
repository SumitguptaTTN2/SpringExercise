package com.ttn.restfulwebservicespart2.staticDynamicFiltering.service;

import com.ttn.restfulwebservicespart2.staticDynamicFiltering.entity.Student;

import java.util.HashMap;

public interface StudentService {
    public HashMap getAllStudents();
    public Student addNewStudent(Student student);
    public Student getStudentById(int studentId);
}
