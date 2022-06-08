package com.neptum.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test
{
	public static void main(String[] args)
	{
		String path = "com/neptum/spring/springcoreadvanced/standalone/collections/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		ProductList pl = (ProductList) ctx.getBean("productList");
		System.out.println(pl);
		System.out.println("Type: " + pl.getClass());
		System.out.println("Hash: " + pl.hashCode());
	}
}