package com.neptum.spring.springcore.list;

import java.util.List;

public class Hospital
{
	private String name;
	private List<String> departments;
	
	public String getName() {
		return name;
	}
	
	public List<String> getDepartments() {
		return departments;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}
}