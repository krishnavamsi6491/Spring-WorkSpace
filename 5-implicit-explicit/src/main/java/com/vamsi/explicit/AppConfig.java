package com.vamsi.explicit;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vamsi.Repository.PersonDAO;
import com.vamsi.service.personservice;

@Configuration
public class AppConfig {
	
	@Bean
	public PersonDAO pdao() {
		return new PersonDAO();
	}
	
	@Bean
	public personservice pservice(PersonDAO pdao) {
		return new personservice(pdao);
	}
	

}
