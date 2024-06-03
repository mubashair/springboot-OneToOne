package com.jpa.model;

public class EmployeeDTO {
	
	private Integer id;
	private String firstName;
	private String lastName;
	
	private PassportDTO passportDTO;
	
	
	
	//passportdto getters and setters
	public PassportDTO getPassportDTO() {
		return passportDTO;
	}
	public void setPassportDTO(PassportDTO passportDTO) {
		this.passportDTO = passportDTO;
	}
	
	
	
	public Integer getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
