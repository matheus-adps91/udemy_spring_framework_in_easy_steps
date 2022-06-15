package com.neptum.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.neptum.spring.springmvc.dto.User;

@Controller
public class UserController {
	
	@RequestMapping(value = "registrationPage2")
	public String showRegistrationPage2() {
		return "userReg";
	}
	
	@RequestMapping(value = "registerUser2", method = RequestMethod.POST)
	public String registerUser2(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(user);
		model.addAttribute("user", user);
		return "regResult";
	}

	@RequestMapping(value = "registrationPage")
	public ModelAndView showRegistrationPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("userReg");	
		return modelAndView;
	}
	
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("regResult");
		return modelAndView;
	}
}
