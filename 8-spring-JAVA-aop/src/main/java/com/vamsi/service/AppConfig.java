package com.vamsi.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.vamsi")
@EnableAspectJAutoProxy
public class AppConfig {
	
	

}
