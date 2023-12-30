package com.spring.springmvcweb.springmvcexam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.springmvcweb.springmvcexam.model.EmployeeModel;

@Controller
public class EmployeeController {
	@RequestMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("hello");
		
		EmployeeModel employee=new EmployeeModel();
		employee.setName("Anbuselvi");
		employee.setCity("Madurai");
		modelAndView.addObject("employee",employee);
		
		return modelAndView;
	}

}
