package com.neptum.spring.springcore.constructorinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test
{
	public static void main(String[] args)
	{
		String path = "com/neptum/spring/springcore/constructorinjection/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		Employee employee = (Employee) ctx.getBean("employee");
		System.out.println(employee);
		System.out.println("Type: " + employee.getClass());
		System.out.println("Hash: " + employee.hashCode());
		
		Employee employee2 = (Employee) ctx.getBean("employee2");
		System.out.println(employee2);
		System.out.println("Type: " + employee2.getClass());
		System.out.println("Hash: " + employee2.hashCode());
	}
}