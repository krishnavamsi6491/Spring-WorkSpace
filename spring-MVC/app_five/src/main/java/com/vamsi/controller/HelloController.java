package com.vamsi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/hello")
	public String getHello() {
		System.out.println("getHello() called");
		
		return "hello";
		
	}

}
