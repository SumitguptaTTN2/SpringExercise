package com.ttn.employee.services;

import com.ttn.employee.entities.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);

    public Employee updateEmployeeById(int id, Employee employee);

    public Employee getEmployeeBYId(int id);

    public Long totalCount();

    public List<Employee> findByEmployeeName(String name);

    public List<Employee> startsWithChar(char letter);

    public String deleteEmployeeById(int id);

    public List<Employee> findAgeInBetween(int startAge, int endAge);
    public List<Employee> paginationAndSortByAge(int page, int size, int age);
}
