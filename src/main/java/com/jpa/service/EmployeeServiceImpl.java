package com.jpa.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


import com.jpa.entity.Employee;
import com.jpa.model.EmployeeDTO;
import com.jpa.repository.EmployeeJpaRepository;

import jakarta.transaction.Transactional;



@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeJpaRepository employeeJpaRepository;
	private ModelMapper modelMapper;
	
	@Bean
	public ModelMapper getModelMapper(){
		modelMapper = new ModelMapper();
		return modelMapper;
	}

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeJpaRepository.save(employee);
	}

	@Override
	public EmployeeDTO findEmployeeById(Integer id) {
		Employee employeeEntity = employeeJpaRepository.findById(id).get();
		//logic convert entity to dto
		//ModelMapper modelMapper = new ModelMapper();
		EmployeeDTO employeeDTO = modelMapper.map(employeeEntity, EmployeeDTO.class);
		return employeeDTO;
	}

	@Override
	public List<EmployeeDTO> findAllEmployees() {
		
		List<Employee> employeeEntity = employeeJpaRepository.findAll();
		List<EmployeeDTO> employeeDTO= (List<EmployeeDTO>) modelMapper.map(employeeEntity, EmployeeDTO.class);
		
		return employeeDTO;
	}

}
