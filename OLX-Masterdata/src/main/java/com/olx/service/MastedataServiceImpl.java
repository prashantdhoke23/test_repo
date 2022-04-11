package com.olx.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olx.dto.Category;
import com.olx.dto.StatusList;
import com.olx.entity.CategoryEntity;
import com.olx.entity.StatusListEntity;
import com.olx.repo.CategoryRepo;
import com.olx.repo.StatusListRepo;



@Service
public class MastedataServiceImpl implements MasterdataService {
	
	@Autowired
	CategoryRepo categoryRepo;
	
	@Autowired
	StatusListRepo statusListRepo;
	@Autowired
	ModelMapper modelMapper;

	@Override
	public List<Category> advertiseCategory(Category category) {
		
		List<CategoryEntity> categoryEntityList =categoryRepo.findAll();
		List<Category> categoryDtoList=new ArrayList<Category>();
		for(CategoryEntity categoryEntity : categoryEntityList) {
			
			Category category1=convertEntityintoDTO(categoryEntity);
			categoryDtoList.add(category1);
		}
		return categoryDtoList;
	}

	private Category convertEntityintoDTO(CategoryEntity categoryEntity) {
		
			TypeMap<CategoryEntity,Category> typemap=modelMapper.typeMap(CategoryEntity.class, Category.class);
		typemap.addMappings(mapper->{
		
			mapper.map(categoryEntityy->categoryEntityy.getCategory(), Category::setCategory);

		
		});
		Category category=modelMapper.map(categoryEntity, Category.class);
			return category;
		
	}

	@Override
	public List<StatusList> advertiseStatus(StatusList statusList) {
		
		List<StatusListEntity> statusEntityList =statusListRepo.findAll();
		List<StatusList> statusDtoList=new ArrayList<StatusList>();
		for(StatusListEntity statusEntity : statusEntityList) {
			
			StatusList statusList1=convertEntityintoDTO(statusEntity);
			statusDtoList.add(statusList1);
		}
		return statusDtoList;
	}

	private StatusList convertEntityintoDTO(StatusListEntity statusEntity) {
		TypeMap<StatusListEntity,StatusList> typemap=modelMapper.typeMap(StatusListEntity.class, StatusList.class);
		typemap.addMappings(mapper->{
		
			mapper.map(statusEntityy->statusEntityy.getStatus(), StatusList::setStatus);

		
		});
		StatusList statusList=modelMapper.map(statusEntity, StatusList.class);
			return statusList;	
	}

}
