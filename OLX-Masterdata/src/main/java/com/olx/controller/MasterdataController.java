package com.olx.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.dto.Category;
import com.olx.dto.StatusList;
import com.olx.service.MasterdataService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/olx/masterdata")
@CrossOrigin(origins = "*")
public class MasterdataController {
	
	@Autowired
	MasterdataService masterdataService;
	
	@GetMapping(value="/advertise/category",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Gives Advertise Category",notes = "This Rest API gives information of advertise category")
	public List<Category> advertiseCategory(Category category) {
		return (List<Category>) masterdataService.advertiseCategory(category);
	}
	@GetMapping(value="/advertise/status",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	@ApiOperation(value = "Advertise Status",notes = "This Rest API returns advertise status open/closed")
	public List<StatusList> advertiseStatus(StatusList statusList) {
		return (List<StatusList>) masterdataService.advertiseStatus(statusList);
	}
}
