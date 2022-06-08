package com.neptum.spring.springcore.dependencycheck;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/neptum/spring/springcore/dependencycheck/config.xml");
        Prescription prescription = (Prescription) ctx.getBean("prescription");
        System.out.println(prescription);
        System.out.println("Type: "+ prescription.getClass());
        
        ctx.registerShutdownHook();
    }
}