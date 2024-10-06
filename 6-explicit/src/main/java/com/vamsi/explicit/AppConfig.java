package com.vamsi.explicit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.vamsi.repository.personDAO;
//import com.vamsi.service.personservice;

@Configuration
@ComponentScan(basePackages = "com.vamsi")
public class AppConfig {
	
	@Bean("pdao2")
	@Primary
	 public personDAO persondao() {
		System.out.println("bean-1");
		return new personDAO();
	}

}
