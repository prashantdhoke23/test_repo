package com.olx.controller;

import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.dto.User;
import com.olx.service.LoginService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/olx/login")
@CrossOrigin(origins = "*")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@PostMapping(value="user/authenticate",consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
	,produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value ="Authenticate User ",notes = "This Rest API returns autehnticate users")
	public String authenticate(@RequestBody User user) {
		return loginService.authenticate(user);
	}
	
	@DeleteMapping(value="/user/logout")
	@ApiOperation(value = "Delete user by auth-toke",notes = "This Rest API deletes user")
	public boolean logout(@RequestHeader("auth-token")String authToken) {
		return loginService.logout(authToken);
	}
	@PostMapping(value="/user",consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
	,produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Register User",notes = "This Rest API returns registered user")
	public User registerUser(@RequestBody User user){
		return  loginService.registerUser(user);
		
	}
	@GetMapping(value="/user",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "User Information ",notes = "This Rest API gives user information")
	public User userInformation(@RequestHeader("auth-token") String authtoken,User user){
		return loginService.userInformation(authtoken,user);
		
	}
	
	@GetMapping(value="/token/validate",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Validate taken ",notes = "This Rest API validate taken by auth-token")
	public boolean tokenValidate(@RequestHeader("auth-token") String authtoken) {
		return loginService.tokenValidate(authtoken);
	}
}
