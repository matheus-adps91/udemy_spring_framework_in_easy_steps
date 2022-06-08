package com.neptum.spring.springcore.propertyplaceholder;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test
{
	public static void main(String[] args) 
	{
		String path = "com/neptum/spring/springcore/propertyplaceholder/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		MyDAO myDAO = (MyDAO) ctx.getBean("myDAO");
		System.out.println(myDAO);
	}
}