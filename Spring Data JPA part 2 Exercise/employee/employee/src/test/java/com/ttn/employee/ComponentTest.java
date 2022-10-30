package com.ttn.employee;

import com.ttn.employee.componentMapping.entities.Emp;
import com.ttn.employee.componentMapping.entities.Salary;
import com.ttn.employee.componentMapping.repo.EmpRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComponentTest {
    @Autowired
    private EmpRepository employeeRepository;

    @Test
    public void x() {

    }

    @Test
    public void testEmp() {
        Emp emp = new Emp();
        emp.setFirstName("Sumit");
        emp.setLastName("Gupta");
        emp.setAge(22);
        Salary salary = new Salary();
        salary.setBasicSalary(100d);
        salary.setBonusSalary(120d);
        salary.setTaxAmount(1234d);
        salary.setSpecialAllowanceSalary(1234567d);
        emp.setSalary(salary);
        employeeRepository.save(emp);
    }
}
