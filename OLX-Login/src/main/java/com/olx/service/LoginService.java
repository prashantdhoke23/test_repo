package com.olx.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.olx.dto.User;

public interface LoginService {
	

	public String authenticate( User user);

	public boolean logout(String authToken);

	public User registerUser(User user);

	public User userInformation(String authtoken, User user);

	public boolean tokenValidate(String authtoken);

}
