package com.ttn.restfulwebservicespart2.staticDynamicFiltering.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lombok.*;

@Getter
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Setter
@JsonFilter("Bean")
public class Student {
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String studentPassword;

    public Student(int studentId, String studentName, String studentEmail, String studentPassword) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.studentPassword = studentPassword;
    }
}
