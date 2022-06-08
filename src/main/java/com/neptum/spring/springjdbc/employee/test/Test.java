package com.neptum.spring.springjdbc.employee.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.neptum.spring.springjdbc.employee.dao.EmployeeDao;
import com.neptum.spring.springjdbc.employee.dto.Employee;

class Test
{
	public static void main(String[] args) 
	{
		String path = "com/neptum/spring/springjdbc/employee/test/config.xml";
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(path);
		EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(0);
		employee.setFirstName("Bob");
		employee.setSecondName("Gerguson");
		//int result = employeeDao.create(employee);
		//int result = employeeDao.update(employee);
		//int result = employeeDao.delete(0);
		//System.out.println("Number of records are :" + result);
		Employee retrievedEmp = employeeDao.read(2);
		System.out.println("Queried Record: " + retrievedEmp);
		
		List<Employee> employees = employeeDao.readAll();
		employees.forEach(emp -> System.out.println(emp));
	}
}