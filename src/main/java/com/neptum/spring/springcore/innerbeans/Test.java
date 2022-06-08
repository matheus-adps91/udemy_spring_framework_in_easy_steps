package com.neptum.spring.springcore.innerbeans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/neptum/spring/springcore/innerbeans/config.xml");
        Employee employee = (Employee) ctx.getBean("employee");
        System.out.println(employee);
        System.out.println("Type: "+ employee.getClass());
        System.out.println("Hash Code: " +employee.hashCode());
        
        System.out.println("\nUsing SCOPE = PROTOTYPE");
        Employee employee2 = (Employee) ctx.getBean("employee");
        System.out.println(employee2);
        System.out.println("Type: "+ employee2.getClass());
        System.out.println("Hash Code: " +employee2.hashCode());
        
        ctx.registerShutdownHook();
    }
}