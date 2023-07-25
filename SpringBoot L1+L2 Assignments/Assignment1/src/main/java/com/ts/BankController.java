package com.ts;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@RequestMapping("/bankName")
	public String bankName() {
		return "Bank Name **HDFC**";
	}
	
	@RequestMapping("/bankAddress")
	public String bankAddress() {
		return "Bank Address - Gachibowli,Hyderabad";
	}
}
