package com.vamsi.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		HelloService hs = context.getBean("hs", HelloService.class);
		
		System.out.println(hs.getClass().getName());
	hs.deposite(0,0);
	hs.withdraw(0,0);
	hs.transfer(0,0,0);

	}

}
