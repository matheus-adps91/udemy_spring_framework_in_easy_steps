package com.neptum.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee
{
	private Address address;
	private Department department;

	public Address getAddress() { return address; }

	public Department getDepartment() {
		return department;
	}

	@Autowired @Qualifier("xyz")
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Autowired
	public void setAddress(Address address) { this.address = address; }

	@Override
	public String toString() {
		return "Employee [address=" + address + ", department=" + department + "]";
	}
}