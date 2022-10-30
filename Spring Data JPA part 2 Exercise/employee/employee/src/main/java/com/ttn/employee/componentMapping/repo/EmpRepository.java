package com.ttn.employee.componentMapping.repo;

import com.ttn.employee.componentMapping.entities.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Emp,Integer> {


}
