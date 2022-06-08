package com.neptum.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test
{
	public static void main(String[] args)
	{
		String path = "com/neptum/spring/springcoreadvanced/stereotype/annotations/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		
		Instructor instructor = (Instructor) ctx.getBean("anotherName");
		System.out.println(instructor);
		System.out.println("Type: " + instructor.getClass());
		System.out.println("Hash: " + instructor.hashCode());
		
		System.out.println("---------------------------------------------------------------------------");
		
		Instructor instructor2 = (Instructor) ctx.getBean("anotherName");
		System.out.println(instructor2);
		System.out.println("Type: " + instructor2.getClass());
		System.out.println("Hash: " + instructor2.hashCode());
	}
}