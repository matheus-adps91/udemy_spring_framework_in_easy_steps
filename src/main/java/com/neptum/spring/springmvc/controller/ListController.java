package com.neptum.spring.springmvc.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neptum.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("John");
		employee.setSalary(8000);
		
		Employee employee2 = new Employee();
		employee2.setId(456);
		employee2.setName("Matheus");
		employee2.setSalary(10000);
		
		Employee employee3 = new Employee();
		employee3.setId(789);
		employee3.setName("Bob");
		employee3.setSalary(7000);
		
		List<Employee> employees = Arrays.asList(employee, employee2, employee3);
		modelAndView.addObject("employees", employees);
		
		return modelAndView;
	}
}