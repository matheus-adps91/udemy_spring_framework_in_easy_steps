package com.neptum.spring.springcoreadvanced.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("anotherName")
@Scope("prototype")
class Instructor
{
	@Value("#{T(java.lang.Math).abs(-99)}")
	private int id;
	
	@Value("#{T(java.lang.Integer).MIN_VALUE}")
	private int miniumValor;
	
	@Value("Matheus Augusto")
	private String name;
	
	@Value("#{new java.lang.String('de paula').toUpperCase()}")
	private String middleName = "initial name";
	
	@Value("#{'silva'.toUpperCase()}")
	private String lastName = "initial name";
	
	@Value("#{topics}")
	private List<String> topics;
	
	@Autowired
	private Profile profile;
	
	@Value("#{2+4 > 5}")
	private boolean active = false;
	
	@Value("#{2+4 > 8? true : false}")
	private boolean expression;
	
	public List<String> getTopics() { return topics; }

	public void setTopics(List<String> topics) { this.topics = topics; }

	public int getId() { return id; }

	public void setId(int id) { this.id = id; }

	public String getName() { return name; }

	public void setName(String name) { this.name = name; }

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", miniumValor=" + miniumValor + ", name=" + name + ", middleName=" + middleName
				+ ", lastName=" + lastName + ", \ntopics=" + topics + ", profile=" + profile + ", \nactive=" + active
				+ ", expression=" + expression + "]";
	}
}