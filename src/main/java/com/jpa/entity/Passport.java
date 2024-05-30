package com.jpa.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Passport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String passportNumber;
	
	public Long getId() {
		return id;
	}
	public String getPassportNumber() {
		return passportNumber;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

}
