package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vamsi.service.HelloService;

import Accountmodel.model.Account;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		
		HelloService service = context.getBean(HelloService.class);
		
		service.deposit(service.new Account(1), 1000);
	}

	

}
