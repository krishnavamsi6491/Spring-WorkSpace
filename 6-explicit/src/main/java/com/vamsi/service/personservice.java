package com.vamsi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamsi.repository.personDAO;
@Service("pservice")
public class personservice {
	
	@Autowired
	private personDAO pdao;
	
	public personservice() {
		System.out.println("personservice constructor");
	}
	
	public personservice(personDAO pdao) {
		System.out.println("personservice(pdao) constructor");
		this.pdao=pdao;
		
	}
	

	public personDAO getPdao() {
		return pdao;
	}
	
	}
