package com.vamsi.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamsi.Controller.HelloController;

public class App {

	public static void main(String[] args) {
		
		
	   ApplicationContext context= new	ClassPathXmlApplicationContext("Spring-Bean.xml");
	   
	   HelloController hc = context.getBean("hc", HelloController.class);
	   String res = hc.handleReqest();
		System.out.println(res);
	}

}
