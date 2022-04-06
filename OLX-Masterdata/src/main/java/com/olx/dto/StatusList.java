package com.olx.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Status DTO")
public class StatusList {
@ApiModelProperty(value = "Status id")
private int id;
@ApiModelProperty(value = "Status status")
private String status;
public StatusList(int id, String status) {
	this.id = id;
	this.status = status;
}
public StatusList() {
	
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
	return "StatusList [id=" + id + ", status=" + status + "]";
}

}
