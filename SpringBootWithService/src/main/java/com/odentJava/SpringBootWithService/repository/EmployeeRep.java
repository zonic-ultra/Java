package com.odentJava.SpringBootWithService.repository;

import com.odentJava.SpringBootWithService.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRep extends JpaRepository<Employee, Long> {
}
