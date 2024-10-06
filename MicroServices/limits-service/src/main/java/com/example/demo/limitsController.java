package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitsController {

	
	@Autowired
	limitsConfiguration configure;
	
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(configure.getMinimum(),configure.getMaximum());
	}

}
