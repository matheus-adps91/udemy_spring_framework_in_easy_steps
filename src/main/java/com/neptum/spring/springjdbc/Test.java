package com.neptum.spring.springjdbc;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

class Test
{
	public static void main(String[] args) 
	{
		String path = "com/neptum/spring/springjdbc/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "insert into employee values(?, ?, ?)";
		int result = jdbcTemplate.update(sql, Integer.valueOf(1), "Matheus Augusto", "de Paula Silva");
		System.out.println("Number of records are :" + result);
	}
}