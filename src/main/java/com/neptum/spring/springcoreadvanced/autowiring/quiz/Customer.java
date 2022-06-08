package com.neptum.spring.springcoreadvanced.autowiring.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

class Customer
{
	private String name;	
	private Reservation reservation;
	private Bill sumOfServices;
	
	public String getName() { return name; }
	
	public void setName(String name) { this.name = name; }
	
	public Reservation getReservation() { return reservation; }
	
	@Autowired
	public void setReservation(Reservation reservation) { this.reservation = reservation; }
	
	public Bill getSumOfServices() { return sumOfServices; }

	@Autowired @Qualifier("bill")
	public void setSumOfServices(Bill sumOfServices) { this.sumOfServices = sumOfServices; }

	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + ", sumOfServices=" + sumOfServices + "]";
	}
}