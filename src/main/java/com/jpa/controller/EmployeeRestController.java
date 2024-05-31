package com.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.entity.Employee;
import com.jpa.service.EmployeeService;

@RestController
public class EmployeeRestController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("createEmployee")
	public ResponseEntity<Employee> creatEmployee(@RequestBody Employee employee){
		Employee employee1 = employeeService.createEmployee(employee);
		return new ResponseEntity<>(employee1, HttpStatus.CREATED);
	}
	@GetMapping("findEmployeeById/{id}")
	public ResponseEntity<Employee> findEmployeeById(@PathVariable Integer id){
		Employee employee = employeeService.findEmployeeById(id);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}
	@GetMapping("findAllEmployees")
	public ResponseEntity<List<Employee>> findAllEmployees(){
		//Employee employee = employeeService.findEmployeeById(id);
		//return new ResponseEntity<Employee>(employee, HttpStatus.OK);
		List<Employee> employees = employeeService.findAllEmployees();
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
		
	}
	

}