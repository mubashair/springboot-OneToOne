package com.jpa.model;

public class PassportDTO {
	
	private Long id;
	private String passportNumber;
	
	private EmployeeDTO employeeDTO;
	
	
	public EmployeeDTO getEmployeeDTO() {
		return employeeDTO;
	}
	public void setEmployeeDTO(EmployeeDTO employeeDTO) {
		this.employeeDTO = employeeDTO;
	}
	
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
