package com.neptum.spring.springcoreadvanced.injecting.interfaces.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test
{
	public static void main(String[] args)
	{
		String path = "com/neptum/spring/springcoreadvanced/injecting/interfaces/annotations/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		OrderBO orderBO = (OrderBO) ctx.getBean("orderBOImpl");
		System.out.println(orderBO);
		System.out.println("Type: " + orderBO.getClass());
		System.out.println("Hash: " + orderBO.hashCode());
		orderBO.placeHolder();
	}
}