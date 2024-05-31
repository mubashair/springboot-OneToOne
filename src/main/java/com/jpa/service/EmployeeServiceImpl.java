package com.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.entity.Employee;
import com.jpa.repository.EmployeeJpaRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeJpaRepository employeeJpaRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeJpaRepository.save(employee);
	}

	@Override
	public Employee findEmployeeById(Integer id) {
		return employeeJpaRepository.findById(id).get();
		//return null;
	}

	@Override
	public List<Employee> findAllEmployees() {
		
		return employeeJpaRepository.findAll();
	}

}
