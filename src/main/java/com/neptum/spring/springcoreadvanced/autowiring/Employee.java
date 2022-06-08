package com.neptum.spring.springcoreadvanced.autowiring;

public class Employee
{
	private Address xyz;
	
	public Employee() { 
		System.out.println("Construtor Padrao");
	}

	public Employee(Address address) {
		System.out.println("Construtor Parameterizado");
		this.xyz = address;
	}

	public Address getAddress() { return xyz; }

	public void setXyz(Address address) { this.xyz = address; }

	@Override
	public String toString() {
		return "Employee [address=" + xyz + "]";
	}
}