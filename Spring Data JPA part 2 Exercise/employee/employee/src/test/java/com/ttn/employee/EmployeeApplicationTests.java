package com.ttn.employee;

import com.ttn.employee.jpqlnative.entities.Employee;
import com.ttn.employee.jpqlnative.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeApplicationTests {
    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void creteEmployee() {
        Employee employee = new Employee();
        employee.setFirstName("Sumit");
        employee.setLastName("singh");
        employee.setAge(19);
        employee.setSalary(20);
        employeeRepository.save(employee);

    }

    @Test
    void TestJpql() {
        List<Object[]> employees = employeeRepository.findFnLnJpql();
        for (Object[] obj : employees) {
            for (Object o : obj) {
                System.out.print(o + " ");
            }
            System.out.println();
        }
    }

    //    @Test
//    @Transactional
//    void testJpql2() {
//        employeeRepository.findUserByStatusAndName(6989l);
//    }
    @Test
    public void TestNative() {
        List<Object[]> employees = employeeRepository.findDataEndSWithSingh();
        for (Object[] obj : employees) {
            for (Object o : obj) {
                System.out.print(o + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void delete() {
        employeeRepository.DeleteAgeGreaterThan(18);
    }

    @Test
    public void deleteByMinTest() {
        employeeRepository.deleteEmployeeByMinSalary();
    }
}
