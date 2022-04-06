package com.olx.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.olx.dto.User;

@Service
public class LoginServiceImpl implements LoginService{

	@Override
	public String authenticate(User user) {
			return "A345Bj9";
	}
	public boolean logout(String authToken) {
		return true;
	}
	@Override
	public User registerUser(User user) {
		return  user;
	}
	
	@Override
	public User userInformation(String authtoken,User user) {
	    if(authtoken.equals(authtoken)) {
	    	return  user;
	    }
	    return null;
	}
	@Override
	public boolean tokenValidate(String authtoken) {
		if(authtoken.equals(authtoken)) {
			return true;
		}
		return false;
	}

}
