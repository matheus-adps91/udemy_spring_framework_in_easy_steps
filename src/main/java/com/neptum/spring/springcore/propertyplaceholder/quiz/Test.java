package com.neptum.spring.springcore.propertyplaceholder.quiz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test
{
	public static void main(String[] args) 
	{
		String path = "com/neptum/spring/springcore/propertyplaceholder/quiz/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		String url = (String) ctx.getBean("url");
		System.out.println(url);
		String client = (String) ctx.getBean("client");
		System.out.println(client);
		String password = (String) ctx.getBean("password");
		System.out.println(password);
	}
}