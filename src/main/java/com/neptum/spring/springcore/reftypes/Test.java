package com.neptum.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/neptum/spring/springcore/reftypes/config.xml");
        Student student = (Student) ctx.getBean("student");
        System.out.println(student);
    }
}