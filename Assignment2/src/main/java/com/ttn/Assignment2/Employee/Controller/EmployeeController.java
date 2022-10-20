package com.ttn.Assignment2.Employee.Controller;


import com.ttn.Assignment2.Employee.Service.Employee;
import com.ttn.Assignment2.Employee.Service.EmployeeServiceImpl;
import com.ttn.Assignment2.Employee.Exceptions.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeServiceImpl employeeServiceImpl;

    public EmployeeController(EmployeeServiceImpl employeeServiceImpl) {
        this.employeeServiceImpl = employeeServiceImpl;
    }


    @RequestMapping(method = RequestMethod.GET, path = "/employee")
    public List<Employee> showAllEmployeeDetails() {
        System.out.println("Getting Employee details");
        return employeeServiceImpl.getAllEmployee();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/employee/{id}")
    public Employee showEmployeeDetailsByID(@PathVariable int id) {
        System.out.println("showEmployeeDetailsByID" + id);
        Employee emp = employeeServiceImpl.getEmployeeById(id);
        if (emp == null)
            throw new EmployeeNotFoundException(String.format("Employee %s Not Found", id));
        return emp;
    }

        @RequestMapping(method = RequestMethod.POST, path = "/employee")
    public Employee createNewEmployee(@Valid @RequestBody Employee employee) {
        System.out.println("createNewEmployee");
        Employee emp = employeeServiceImpl.saveEmployee(employee);
        System.out.println(emp.toString());
        return emp;
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/employee/{id}")
    public void deleteEmployeeById(@PathVariable int id) {
        System.out.println("deleteEmployeeById" + id);
        employeeServiceImpl.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/employee/{id}")
    public Employee updateEmployeeDetails(@Valid @RequestBody Employee employee, @PathVariable int id) {
        System.out.printf("UpdatedEmployee %s %n", id);
        Employee emp = employeeServiceImpl.getEmployeeById(id);
        if (emp == null) {
            throw new EmployeeNotFoundException(String.format("Employee %s Not Found", id));
        } else {
            emp.setName(employee.getName());
            emp.setAge(employee.getAge());
        }
        return emp;
    }

}
