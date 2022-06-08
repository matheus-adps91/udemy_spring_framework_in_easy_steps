package com.neptum.spring.springorm.product.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.neptum.spring.springorm.entity.Product;
import com.neptum.spring.springorm.product.dao.ProductDao;

public class Test {

	public static void main(String[] args) {
		String url = "com/neptum/spring/springorm/product/test/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(url);
		ProductDao productDao = (ProductDao) ctx.getBean("productDao");

//		Product product = new Product();
//		product.setId(1);
//		product.setName("Iphone");
//		product.setDesc("It's awesome");
//		product.setPrice(800);
		
		//productDao.create(product);
		//productDao.update(product);
		//productDao.delete(product);
		
		Product product = productDao.find(1);
		System.out.println(product);
		
		List<Product> products = productDao.findAll();
		products.forEach( prod -> System.out.println(prod));
	}

}