package com.olx.controller;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale.Category;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.olx.service.AdvertiseService;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
@RestController
@RequestMapping("/olx/advertise")
@CrossOrigin(origins = "*")
public class AdvertiseController {
	
	@Autowired
	AdvertiseService advertiseService;
	
	@PostMapping(value="/advertise",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Add new Advertise",notes = "This Rest API Adding new advertises")
	public AdvertiseService addNewAdvertise(@RequestBody AdvertiseService data,@RequestHeader("auth-token") String authToken) {
	return ((AdvertiseController) advertiseService).addNewAdvertise(data, authToken);
	}



	@PutMapping(value="/advertise/{id}",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Updating Advertise",notes = "This Rest API updates advertises by id")
	public AdvertiseService updateAdvertise(@PathVariable("id") int id,@RequestBody AdvertiseService data,@RequestHeader("auth-token") String authToken) {
	return advertiseService.updateAdvertise(id, data, authToken);
	}



	@GetMapping(value="/user/advertise", produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Read advertisment and post ",notes = "This Rest API return advertisement and post by user")
	public List<AdvertiseService> getAllMasterData(@RequestHeader("auth-token") String authToken){
	return advertiseService.getAllAdvertiseService(authToken);
	}



	@GetMapping(value="/user/advertise/{advertiseId}", produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Read advertisment and post ",notes = "This Rest API return advertisement and post by user id")
	public AdvertiseService getMasterDataOfUserById(@PathVariable("advertiseId") int id,@RequestHeader("auth-token") String authToken) {
	return advertiseService.getAdvertiseServiceOfUserById(id,authToken);
	}



	@DeleteMapping(value="/user/advertise/{advertiseId}")
	@ApiOperation(value = "Deletes advertisment and post ",notes = "This Rest API deletes advertisement and post by user")
	public boolean deleteMasterDataById(@PathVariable("advertiseId") int id,@RequestHeader("auth-token") String authToken) {
	return advertiseService.deleteAdvertiseServiceById(id,authToken);
	}

	@GetMapping(value="/search/filtercriteria", produces=MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Search  advertisment  ",notes = "This Rest API searched advertisment and post by user")
	public List<AdvertiseService> searchAdvertisesByFilterCriteria(@RequestParam("searchText")String searchText,
	@RequestParam(name = "category", required = false)int categoryId, @RequestParam("postedBy")String postedBy,
	@RequestParam("dateCondition")String dateCondition,
	@RequestParam("onDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate onDate,
	@RequestParam("fromDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromDate,
	@RequestParam("toDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toDate,
	@RequestParam("sortedBy")String sortedBy, @RequestParam(name = "startIndex", defaultValue="0")int startIndex, @RequestParam(name="records", defaultValue = "10")int records
	) {
	return AdvertiseService.searchAdvertisesByFilterCriteria(searchText, categoryId, postedBy, dateCondition,
	onDate, fromDate, toDate, sortedBy, startIndex, records);
	}



	}

