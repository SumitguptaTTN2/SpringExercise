package com.ttn.employee.jpqlnative.repos;

import com.ttn.employee.jpqlnative.entities.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "SELECT firstName,lastName FROM Employee WHERE salary > ( SELECT AVG(salary) FROM Employee ) ORDER BY age ASC ,salary DESC")
    public List<Object[]> findFnLnJpql();
    @Query(value = "DELETE FROM Employee WHERE salary > (SELECT MIN(salary) from Employee )")
    @Modifying
    @Transactional
    void deleteEmployeeByMinSalary();

    //    Update salary of all employees by a salary passed as a parameter whose existing salary is less than the average salary.
//    @Query(value = "Update Employee set salary=:sal  where salary in ( SELECT salary from (SELECT salary from Employee where salary> AVG(salary))as e)")
//    @Modifying
//    void findUserByStatusAndName(@Param("sal") Long sal);

    @Query(value = "select e.id ,e.firstname ,e.lastname from employee e where lastname like '%singh' ", nativeQuery = true)
    List<Object[]> findDataEndSWithSingh();

    @Query(value = "Delete from employee e where age>:ag", nativeQuery = true)
    @Modifying
    @Transactional
    void DeleteAgeGreaterThan(int ag);


}
