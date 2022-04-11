package com.olx.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "category")
public class CategoryEntity {
	
	@ApiModelProperty(value = "Category id")
	@Id
	private int id;
	@Column(name = "categoryValue")
	@ApiModelProperty(value = "Category category")
	private String category;
	public CategoryEntity() {
		
	}
	@Override
	public String toString() {
		return "CategoryEntity [id=" + id + ", category=" + category + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public CategoryEntity(int id, String category) {
		super();
		this.id = id;
		this.category = category;
	}

}
