package com.neptum.spring.springcore.lc.annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/neptum/spring/springcore/lf/annotations/config.xml");
        Patient patient = (Patient) ctx.getBean("patient");
        System.out.println(patient);
        System.out.println("Type: "+ patient.getClass());
        
        ctx.registerShutdownHook();
    }
}