package com.ttn.employee;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeDataApplicationTests {
//    @Autowired
//    EmployeeRepository employeeRepository;
//
//    public static List<Employee> addEmployeeManually() {
//        List<Employee> list = new ArrayList<>();
//
//        Employee employee = new Employee();
//        Employee employee1 = new Employee();
//        Employee employee2 = new Employee();
//
//        employee.setName("Sumit");
//        employee.setAge(22);
//        employee.setLocation("orai");
//
//        employee1.setName("Aryabhatta");
//        employee1.setAge(20);
//        employee1.setLocation("Delhi");
//
//        employee2.setName("Ram");
//        employee2.setAge(22);
//        employee2.setLocation("haryana");
//        list.add(employee);
//        list.add(employee1);
//        list.add(employee2);
//        return list;
//    }

    @Test
    void contextLoads() {
    }
//
//    @Test
//    public void createEmployee() {
//
//        List<Employee> list = addEmployeeManually();
//        System.out.println(list.toString());
//        list.forEach(employee -> employeeRepository.save(employee));
//    }
//
//    @Test
//    public void updateEmployeeById() {
//        Employee employee = employeeRepository.findById(1).get();
//        employee.setLocation("Noida");
//        employeeRepository.save(employee);
//    }
//
//
//    @Test
//    public void displayEmployeeBYId() {
//        Employee employee = employeeRepository.findById(1).get();
//        System.out.println(employee.toString());
//    }
//
//    @Test
//    public void deleteEmployeeById() {
//        Employee employee = employeeRepository.findById(3).get();
//        employeeRepository.delete(employee);
//    }
//
//    @Test
//    public void totalCount() {
//        System.out.println(employeeRepository.count());
//    }
//
//    @Test
//    public void paginationAndSortByAge() {
//        Pageable paging = PageRequest.of(0, 1, Sort.by(Sort.Order.asc("name")));
//        Page<Employee> pagedResult = employeeRepository.findAllByAge(22, paging);
//        pagedResult.get().forEach(System.out::println);
//    }
//
//    @Test
//    public void findByEmployeeName() {
//        List<Employee> employee = employeeRepository.findByName("Sumit");
//        employee.forEach(emp -> System.out.println(emp.toString()));
//    }
//
//    @Test
//    public void startsWithA() {
//        List<Employee> employee = employeeRepository.findByNameLike("A%");
//        employee.forEach(emp -> System.out.println(emp.toString()));
//    }
//
//    @Test
//    public void findAgeInBetween() {
//        List<Employee> employee = employeeRepository.findByAgeBetween(21, 23);
//        employee.forEach(emp -> System.out.println(emp.toString()));
//    }

}
