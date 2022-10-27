package com.ttn.employee.repositories;

import com.ttn.employee.entities.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>, PagingAndSortingRepository<Employee, Integer> {
    Page<Employee> findAllByAge(int age, Pageable pageable);

    List<Employee> findByName(String name);

    List<Employee> findByNameLike(String name);

    List<Employee> findByAgeBetween(int age1, int age2);

}
