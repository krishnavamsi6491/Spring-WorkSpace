package com.vamsi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/message")
public class HelloController {
	
	@RequestMapping("/hello")
public String gethello() {
	System.out.println("gethello() Called");
	return "Hellovamsi";
	
}
	
	@RequestMapping({"/hi","/bye"})
	public String gethi() {
		System.out.println("getMessage() Called");
		return "Hivamsi";
		
	}
}
