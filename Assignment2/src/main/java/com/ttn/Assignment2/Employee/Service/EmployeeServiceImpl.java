package com.ttn.Assignment2.Employee.Service;

import com.ttn.Assignment2.Employee.Exceptions.EmployeeNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class EmployeeServiceImpl {
    private static int idCount = 0;
    private static final List<Employee> empList = new ArrayList<>();

    static {
        empList.add(new Employee(++idCount, "Sumit", 20));
        empList.add(new Employee(++idCount, "Punnet", 21));
        empList.add(new Employee(++idCount, "Lalit", 22));
    }

    public List<Employee> getAllEmployee() {
        return empList;
    }

    public Employee getEmployeeById(int id) {
        Predicate<? super Employee> predicate = employee -> employee.getId().equals(id);
        return empList.stream().filter(predicate).findFirst().orElse(null);
    }

    public Employee saveEmployee(Employee employee) {
        employee.setId(++idCount);
        employee.setName(employee.getName());
        employee.setAge(employee.getAge());
        empList.add(employee);
        return employee;
    }

    public Employee deleteById(int id) {
        Predicate<? super Employee> predicate = employee -> employee.getId().equals(id);
        Employee emp = empList.stream().filter(predicate).findFirst().orElse(null);
        if (emp == null) {
            throw new EmployeeNotFoundException("Employee Not Found that You Want To Delete");
        } else
            empList.removeIf(predicate);
        return emp;

    }
}
