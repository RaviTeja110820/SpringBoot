package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SampleController {

	@RequestMapping("hi")
	public String display() {

		// return "default page...vachindii";
		return "<html><body><h1>ochindiii rooo</h1></body></html>";
	}
}
