package com.neptum.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/neptum/spring/springcore/map/config.xml");
        Customer customer = (Customer) ctx.getBean("customer");
        System.out.println("Customer ID: " + customer.getId() );
        System.out.println("Produtos: " + customer.getProducts());
        System.out.println("Map type: "+ customer.getProducts().getClass());
    }
}