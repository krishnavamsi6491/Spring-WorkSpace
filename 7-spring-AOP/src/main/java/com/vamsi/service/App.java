package com.vamsi.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-bean.xml");
		AccountService asi = context.getBean("as",AccountService.class);
		
		asi.deposite(0, 0);
		asi.withdraw(0, 0);
		asi.transfer(0, 0, 0);

	}

}
