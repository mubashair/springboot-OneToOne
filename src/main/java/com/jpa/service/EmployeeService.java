package com.jpa.service;

import java.util.List;

import com.jpa.entity.Employee;
import com.jpa.model.EmployeeDTO;

public interface EmployeeService {
	Employee createEmployee(Employee employee);
	EmployeeDTO findEmployeeById(Integer id);
	List<EmployeeDTO> findAllEmployees();
}
