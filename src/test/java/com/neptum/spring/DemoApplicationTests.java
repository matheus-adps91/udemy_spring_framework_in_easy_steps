package com.neptum.spring;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.neptum.spring.entities.Product;
import com.neptum.spring.repos.ProductRepository;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	ApplicationContext context;
	
	@Test
	public void saveProduct() {
		ProductRepository repository = context.getBean(ProductRepository.class);
		
		Product product = new Product();
		product.setId(1L);
		product.setName("Mac");
		product.setDescription("Awesome");
		product.setPrice(1200d);
		repository.save(product);
		Optional<Product> oResult = repository.findById(1l);
		Product result = oResult.get();
		System.out.println(result);
		result.setPrice(1500d);
		repository.save(result);
		
		repository.findAll().forEach(prod -> System.out.println(prod));
		
		System.out.println("------- Using Derived Queries ----------");
		System.out.println(repository.findByName("Mac"));
		System.out.println(repository.findByPrice(1500d));
		System.out.println(repository.findByNameAndPrice("Mac", 1500d));
	}

}
