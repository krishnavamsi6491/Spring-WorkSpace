package com.vamsi.controller;

//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller

public class Message {

	@RequestMapping("/message")
	public String handleRequest() {	
		System.out.println("handleRequest() called");
		return "messagepage";
	}
}
