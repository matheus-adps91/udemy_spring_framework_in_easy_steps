package com.neptum.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/neptum/spring/springcore/set/config.xml");
        CarDealer carDealer = (CarDealer) ctx.getBean("carDealer");
        System.out.println("Loja: " + carDealer.getName() );
        System.out.println("Modelos: " + carDealer.getModels());
        System.out.println("Set type: "+ carDealer.getModels().getClass());
    }
}