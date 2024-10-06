package com.vamsi.explicit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vamsi.Repository.PersonDAO;
import com.vamsi.service.personservice;

public class App {

	public static void main(String[] args) {
		 
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		PersonDAO DAO = context.getBean("pdao", PersonDAO.class);
		System.out.println(DAO);
		
		personservice service = context.getBean("pservice", personservice.class);
		System.out.println(service);
		
		
	System.out.println(service.getPdao());
		context.close();
	
	}

}
