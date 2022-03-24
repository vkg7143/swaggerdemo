package com.vcs.swaggerdemo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("Description about contact model")
public class Contact {

	@ApiModelProperty("The unique id ")
	String id;
	@ApiModelProperty("contact person name")
	private String name;
	@ApiModelProperty("Phone number of person")
	private String phone;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
