package com.olx.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.olx.dto.Category;
import com.olx.dto.StatusList;

@Service
public class MastedataServiceImpl implements MasterdataService {

	@Override
	public List<Category> advertiseCategory(Category category) {
		// TODO Auto-generated method stub
		return (List<Category>) category;
	}

	@Override
	public List<StatusList> advertiseStatus(StatusList statusList) {
		// TODO Auto-generated method stub
		return (List<StatusList>) statusList;
	}

}
