package com.olx.service;

import java.util.List;



import com.olx.dto.Category;
import com.olx.dto.StatusList;


public interface MasterdataService {

	List<Category> advertiseCategory(Category category);

	List<StatusList> advertiseStatus(StatusList statusList);

}
