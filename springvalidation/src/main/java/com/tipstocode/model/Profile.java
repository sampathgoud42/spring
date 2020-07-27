package com.tipstocode.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import com.sun.istack.internal.NotNull;
import com.tipstocode.validator.custom.Mobile;

public class Profile {
	
	//Fields
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;
	
	@NotBlank
	@NotNull
	@Mobile
	private String mobileNumber;
	
	@NotBlank
	@Email
	private String emailId;	
		
	//Constructor
	
	public Profile(){}	

	public Profile(String firstName, String lastName, String mobileNumber,
			String emailId) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		
	}
	
	//Getters and Setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	
	

}
