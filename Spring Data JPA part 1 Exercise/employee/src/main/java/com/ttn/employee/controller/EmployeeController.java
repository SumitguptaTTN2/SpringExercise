package com.ttn.employee.controller;

import com.ttn.employee.entities.Employee;
import com.ttn.employee.services.EmployeeServiceImpl;
import org.hibernate.persister.entity.SingleTableEntityPersister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeServiceImpl employeeService;

    @PostMapping("/create")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployeeById(@PathVariable int id, @RequestBody Employee employee) {
        return employeeService.updateEmployeeById(id, employee);
    }

    @GetMapping("get/{id}")
    public Employee getEmployeeBYId(@PathVariable int id) {
        return employeeService.getEmployeeBYId(id);
    }

    @GetMapping("/getCount")
    public Long totalCount() {
        return employeeService.totalCount();
    }

    @GetMapping("/findByName/{name}")
    public List<Employee> findEmployeeByName(@PathVariable String name) {
        return employeeService.findByEmployeeName(name);
    }

    @GetMapping("startsWith/{letter}")
    public List<Employee> startsWithA(@PathVariable char letter) {
        return employeeService.startsWithChar(letter);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        return employeeService.deleteEmployeeById(id);

    }

    @GetMapping("/get/{start}/{end}")
    public List<Employee> findAgeInBetween(@PathVariable int start, @PathVariable int end) {
        return employeeService.findAgeInBetween(start,end);
    }

    @GetMapping("/getPage/{page}/{size}/{age}")
    public List<Employee> paginationAndSortByAge(@PathVariable int page, @PathVariable int size, @PathVariable int age) {
        return employeeService.paginationAndSortByAge(page, size, age);
    }
}