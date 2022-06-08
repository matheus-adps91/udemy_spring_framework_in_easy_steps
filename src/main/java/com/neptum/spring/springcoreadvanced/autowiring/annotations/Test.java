package com.neptum.spring.springcoreadvanced.autowiring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test
{
	public static void main(String[] args)
	{
		String path = "com/neptum/spring/springcoreadvanced/autowiring/annotations/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee);
		System.out.println("Type: " + employee.getClass());
		System.out.println("Hash: " + employee.hashCode());
	}
}