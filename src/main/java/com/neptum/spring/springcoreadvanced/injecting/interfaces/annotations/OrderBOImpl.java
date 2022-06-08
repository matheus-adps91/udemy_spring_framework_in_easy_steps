package com.neptum.spring.springcoreadvanced.injecting.interfaces.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
class OrderBOImpl 
	implements 
		OrderBO
{
	@Autowired 
	@Qualifier("dao")
	private OrderDAO orderDAO;
	
	public OrderDAO getOrderDAO() { return orderDAO; }

	public void setOrderDAO(OrderDAO orderDAO) { this.orderDAO = orderDAO; }

	@Override
	public void placeHolder() {
		System.out.println("Inside OrderBO placeHolder()");
		orderDAO.createOrder();
	}
}