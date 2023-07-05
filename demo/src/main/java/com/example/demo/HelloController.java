package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping("/band")
	public String show(String band, Model m) 
	{
		System.out.println(band);
		m.addAttribute("data", band);
		return "empband"; // logical view name
	}

}