package com.neptum.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
class Profile
{
	@Value("Java Architect and Instructor")
	private String title;
	@Value("Neptum Consulting")
	private String company;
	
	public String getTitle() { return title; }
	
	public void setTitle(String title) { this.title = title; }
	
	public String getCompany() { return company; }
	
	public void setCompany(String company) { this.company = company; }
	
	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}
}