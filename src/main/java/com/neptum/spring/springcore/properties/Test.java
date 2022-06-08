package com.neptum.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/neptum/spring/springcore/properties/config.xml");
        CountriesAndLanguages countryAndLangs = (CountriesAndLanguages) ctx.getBean("countriesAndLangs");
        System.out.println(countryAndLangs);
        System.out.println("Set type: "+ countryAndLangs.getCountryAndLangs().getClass());
    }
}