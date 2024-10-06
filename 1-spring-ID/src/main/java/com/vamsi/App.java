package com.vamsi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamsi.Repository.HelloRepository;
import com.vamsi.Repository.HelloRepositoryImpl;
import com.vamsi.controller.HelloController;
import com.vamsi.service.HelloService;
import com.vamsi.service.HelloServiceImpl;

public class App {

	public static void main(String[] args) {
		
		    HelloRepository hr =new HelloRepositoryImpl();
	        HelloService hs= new HelloServiceImpl(hr);
			HelloController hc= new HelloController(hs);
			
			String res=hc.handleRequest();
			System.out.println(res);
			
	}
}
// Source code is decompiled from a .class file using FernFlower decompiler.