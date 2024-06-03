package com.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.model.PassportDTO;
import com.jpa.service.PassportService;

@RestController
public class PassportRestController {
	@Autowired
	PassportService passportService; 
	
	@GetMapping("findPassportById/{id}")
	public ResponseEntity<PassportDTO> findPassportById(@PathVariable Integer id) {
		PassportDTO passportDTO = passportService.findPassportById(id);
		return new ResponseEntity<PassportDTO>(passportDTO, HttpStatus.OK);
	}
	
}
