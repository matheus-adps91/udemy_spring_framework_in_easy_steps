package com.neptum.spring.springcoreadvanced.injecting.interfaces.annotations;

import org.springframework.stereotype.Component;

@Component("dao")
class OrderDAOImpl 
	implements 
		OrderDAO 
{
	@Override
	public void createOrder() {
		System.out.println("Inside Order DAO createOrder()");
	}
}