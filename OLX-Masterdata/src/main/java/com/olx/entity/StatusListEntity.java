package com.olx.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "statusList")
public class StatusListEntity {
	@Id
	@ApiModelProperty(value = "Status id")
	private int id;
	@Column(name = "statusValue")
	@ApiModelProperty(value = "Status status")
	private String status;
	public StatusListEntity() {
		
	}
	public StatusListEntity(int id, String status) {
		
		this.id = id;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "StatusListEntity [id=" + id + ", status=" + status + "]";
	}
	
	
}


