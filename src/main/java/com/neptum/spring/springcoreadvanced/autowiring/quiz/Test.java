package com.neptum.spring.springcoreadvanced.autowiring.quiz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test
{
	public static void main(String[] args)
	{
		String path = "com/neptum/spring/springcoreadvanced/autowiring/quiz/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		Customer customer = (Customer) ctx.getBean("customer");
		System.out.println(customer);
		System.out.println("Type: " + customer.getClass());
		System.out.println("Hash: " + customer.hashCode());
		
		System.out.println(customer.getReservation());
		System.out.println("Type: " + customer.getReservation().getClass());
		System.out.println("Hash: " + customer.getReservation().hashCode());
		
		System.out.println(customer.getSumOfServices());
		System.out.println("Type: " + customer.getSumOfServices().getClass());
		System.out.println("Hash: " + customer.getSumOfServices().hashCode());
	}
}