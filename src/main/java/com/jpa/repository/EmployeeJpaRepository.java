package com.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.entity.Employee;
@Repository
public interface EmployeeJpaRepository extends JpaRepository<Employee, Integer> {

}
