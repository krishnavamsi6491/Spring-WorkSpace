package com.vamsi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
   
	@Bean(name = "s1")
	@Scope("thread")
	//@Lazy
	 public sample s1() {
		 return new sample();
	 }
}
