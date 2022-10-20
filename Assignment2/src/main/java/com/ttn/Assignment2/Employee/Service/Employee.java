package com.ttn.Assignment2.Employee.Service;

import javax.validation.constraints.*;

//Create an Employee Bean(id, name, age) and service to  perform different operations related to employee
public class Employee {

    private Integer id;

    @Size(min = 4, message = "NOt valid")
    @NotNull
    @NotBlank
    @NotEmpty
    private String name;

    @NotNull
    @Min(18)
    @Max(60)
    private Integer age;


    public Employee(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
