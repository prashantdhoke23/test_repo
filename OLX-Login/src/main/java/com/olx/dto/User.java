package com.olx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "User DTO")
public class User {
	@ApiModelProperty(value = "User usernsme")
	private String username;
	
	@ApiModelProperty(value = "User password")
	private String password;
	
	@ApiModelProperty(value = "User firstName")
	private String firstName;
	
	@ApiModelProperty(value = "User lastName")
	private String lastName;
	
	@ApiModelProperty(value = "User email")
	private String email;
	
	@ApiModelProperty(value = "User phone")
	private long phone;
	
	public User() {
		
	}
	public User(String username, String password, String firstName, String lastName, String email, long phone) {
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", phone=" + phone + "]";
	}
	
}
