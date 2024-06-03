package com.jpa.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


import com.jpa.entity.Passport;
import com.jpa.model.PassportDTO;
import com.jpa.repository.PassportJpaRepository;

import jakarta.transaction.Transactional;



@Transactional
@Service
public class PassportServiceImpl implements PassportService {
	@Autowired
	private PassportJpaRepository passportJpaRepository;
	
	private ModelMapper modelMapper;
	@Bean
	public ModelMapper getModel() {
		modelMapper = new ModelMapper();
		return modelMapper;
	}

	@Override
	public PassportDTO findPassportById(Integer id) {
		
		
		Passport passport= passportJpaRepository.findById(id).get();
		PassportDTO passportDTO= modelMapper.map(passport, PassportDTO.class);
		return passportDTO;
	}

}
