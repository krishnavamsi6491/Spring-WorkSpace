package com.vamsi.explicit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vamsi.repository.personDAO;
import com.vamsi.service.personservice;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		System.out.println("hello");
		
		personDAO b1 = context.getBean("pdao1", personDAO.class);
		System.out.println(b1);
		personservice b2 = context.getBean("pservice", personservice.class);
		System.out.println(b2);
		
		
	
     	System.out.println(b2.getPdao());	
		context.close();

	}

}
