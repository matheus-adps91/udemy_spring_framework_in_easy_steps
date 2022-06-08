package com.neptum.spring.springcoreadvanced.injecting.interfaces;

class OrderDAOImpl 
	implements 
		OrderDAO 
{
	@Override
	public void createOrder() {
		System.out.println("Inside Order DAO createOrder()");
	}
}