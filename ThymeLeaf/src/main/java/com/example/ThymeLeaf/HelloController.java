package com.example.ThymeLeaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String display() {
		return "hello";
	}
	
	@RequestMapping("/hi")
	public String hi() {
		return "hi";
	}
}
