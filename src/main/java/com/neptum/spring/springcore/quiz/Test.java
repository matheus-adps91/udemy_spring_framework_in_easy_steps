package com.neptum.spring.springcore.quiz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/neptum/spring/springcore/quiz/config.xml");
        
        Item item1 = (Item) ctx.getBean("firstItem");
        System.out.println("Item 1: " + item1 );
        System.out.println("Type: "+ item1.getClass());
        System.out.println("Object built by setter injection");
        
        Item item2 = (Item) ctx.getBean("secondItem");
        System.out.println("Item 2: " + item2 );
        System.out.println("Type: "+ item2.getClass());
        System.out.println("Object built by setter injection");
        
        Item item3 = (Item) ctx.getBean("thirdItem");
        System.out.println("Item3: " + item3 );
        System.out.println("Type: "+ item1.getClass());
        System.out.println("Object built by constructor injection");
        
        ShoppingCart shopping = (ShoppingCart) ctx.getBean("purchases");
        System.out.println(shopping);
        System.out.println("Type:" +shopping.getClass());
    }
}