package com.olx.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

public interface AdvertiseService {

	AdvertiseService updateAdvertise(int id, AdvertiseService data, String authToken);

	List<AdvertiseService> getAllAdvertiseService(String authToken);

	AdvertiseService getAdvertiseServiceOfUserById(int id, String authToken);

	boolean deleteAdvertiseServiceById(int id, String authToken);

	static List<AdvertiseService> searchAdvertisesByFilterCriteria(String searchText, int categoryId, String postedBy,
			String dateCondition, LocalDate onDate, LocalDate fromDate, LocalDate toDate, String sortedBy,
			int startIndex, int records) {
		
		return null;
	}

	
	
}
