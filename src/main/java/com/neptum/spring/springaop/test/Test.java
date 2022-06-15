package com.neptum.spring.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neptum.spring.springaop.ProductService;

public class Test {

	public static void main(String[] args) {
		String path = "com/neptum/spring/springaop/test/config.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		ProductService productService = (ProductService) ctx.getBean("productService");
		System.out.println(productService.multiply(4, 5));
	}

}