package com.ttn.restfulwebservicespart2.staticDynamicFiltering.repository;

import com.ttn.restfulwebservicespart2.staticDynamicFiltering.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {
    private static int idGenerator;
    private static HashMap<Integer, Student> hashMap = new HashMap<>();

    public HashMap retrieveStudents(){
        return hashMap;
    }

    public Student addNewStudent(Student student){
        idGenerator =idGenerator+1;
        student.setStudentId(idGenerator);
        hashMap.put(idGenerator, student);
        return student;
    }

}
