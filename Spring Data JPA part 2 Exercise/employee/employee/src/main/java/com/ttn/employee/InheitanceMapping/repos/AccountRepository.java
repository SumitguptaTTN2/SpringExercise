package com.ttn.employee.InheitanceMapping.repos;

import com.ttn.employee.InheitanceMapping.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Payment, Integer> {

}
