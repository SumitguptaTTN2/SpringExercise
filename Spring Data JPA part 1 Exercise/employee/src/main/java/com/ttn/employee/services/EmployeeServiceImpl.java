package com.ttn.employee.services;

import com.ttn.employee.entities.Employee;
import com.ttn.employee.exceptions.EmployeeNotFoundException;
import com.ttn.employee.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return employee;
    }


    @Override
    public Employee updateEmployeeById(int id, Employee employee) {
        Employee employee1 = employeeRepository.findById(id).get();
        employee1.setName(employee.getName());
        employee1.setAge(employee.getAge());
        employee1.setLocation(employee.getLocation());
        employeeRepository.save(employee1);
        return employee1;
    }

    @Override
    public Employee getEmployeeBYId(int id) {
        Employee employee = employeeRepository.findById(id).get();
        if (employee == null)
            throw new EmployeeNotFoundException("Employee Not Found");
        else
            return employee;
    }

    @Override
    public Long totalCount() {
        long countEmployee = employeeRepository.count();
        return countEmployee;
    }

    @Override
    public List<Employee> findByEmployeeName(String name) {
        List<Employee> employee = employeeRepository.findByName(name);
        if (employee.stream().findAny().orElse(null) == null)
            throw new EmployeeNotFoundException(String.format("Employee %s is Not in database", name));
        return employee;
    }

    @Override
    public List<Employee> startsWithChar(char letter) {
        List<Employee> employee = employeeRepository.findByNameLike(letter + "%");
        if (employee.stream().findAny().orElse(null) == null)
            throw new EmployeeNotFoundException("Employee Not Found");
        else
            return employee;
    }

    @Override
    public String deleteEmployeeById(int id) {
        Employee employee = employeeRepository.findById(id).get();
        if (employee == null)
            throw new EmployeeNotFoundException("Employee Not Found");
        else {
            employeeRepository.delete(employee);
            return "Successfully Delete Employee";
        }
    }

    @Override
    public List<Employee> findAgeInBetween(int start, int end) {
        List<Employee> employee = employeeRepository.findByAgeBetween(start, end);
        if (employee.stream().findAny().orElse(null) == null) {
            throw new EmployeeNotFoundException("Employee Not Found");
        } else
            return employee;
    }

    @Override
    public List<Employee> paginationAndSortByAge(int page, int size, int age) {
        Pageable paging = PageRequest.of(page, size, Sort.by(Sort.Order.asc("age")));
        Page<Employee> pagedResult = employeeRepository.findAllByAge(age, paging);
        List<Employee> employees = pagedResult.toList();
        if (employees.stream().findAny().orElse(null) == null) {
            throw new EmployeeNotFoundException("Employee Not Found");
        } else
            return employees;

    }

}
