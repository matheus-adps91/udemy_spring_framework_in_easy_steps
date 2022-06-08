package com.neptum.spring.springcoreadvanced.injecting.interfaces;

class OrderBOImpl 
	implements 
		OrderBO
{
	private OrderDAO orderDAO;
	
	public OrderDAO getOrderDAO() { return orderDAO; }

	public void setOrderDAO(OrderDAO orderDAO) { this.orderDAO = orderDAO; }

	@Override
	public void placeHolder() {
		System.out.println("Inside OrderBO placeHolder()");
		orderDAO.createOrder();
	}
}