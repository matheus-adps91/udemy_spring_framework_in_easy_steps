package com.neptum.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/neptum/spring/springcore/list/config.xml");
        Hospital hospital = (Hospital) ctx.getBean("hosp");
        System.out.println("Hospital: " + hospital.getName() );
        System.out.println("Departments: " + hospital.getDepartments());
        System.out.println("List type: "+ hospital.getDepartments().getClass());
    }
}