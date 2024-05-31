package com.jpa.service;

import java.util.List;

import com.jpa.entity.Employee;

public interface EmployeeService {
	Employee createEmployee(Employee employee);
	Employee findEmployeeById(Integer id);
	List<Employee> findAllEmployees();
}
