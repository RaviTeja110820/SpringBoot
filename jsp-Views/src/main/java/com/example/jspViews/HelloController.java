package com.example.jspViews;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String display() {
		return "hello";
	}

	@RequestMapping("/emp")
	public ModelAndView details() 
	{
		ModelAndView model = new ModelAndView();
		model.addObject("Company", "wipro");
		model.addObject("Name", "Ravi");
		model.setViewName("details");
		return model;
	}
	
}
