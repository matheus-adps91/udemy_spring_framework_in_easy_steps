package com.neptum.spring.springcore.dependencycheck.quiz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class Test
{
	public static void main(String[] args)
	{
		String path = "com/neptum/spring/springcore/dependencycheck/quiz/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		University university = (University) ctx.getBean("university");
		System.out.println(university);
		System.out.println("Type: "+ university.getClass());
		System.out.println("Hash: "+ university.hashCode());
		
		University university2 = (University) ctx.getBean("university");
		System.out.println(university2);
		System.out.println("Type: "+ university2.getClass());
		System.out.println("Hash: "+ university2.hashCode());
	}

}
