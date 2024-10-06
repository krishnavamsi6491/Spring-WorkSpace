package com.vamsi.service;

import com.vamsi.Repository.PersonDAO;

public class personservice {
	
	private PersonDAO pdao;
	
	public personservice() {
		System.out.println("personservice constructor");
	}
	
	public personservice(PersonDAO pdao) {
		System.out.println("personservice(dao) constructor");
		this.pdao=pdao;
	}

	public PersonDAO getPdao() {
		return pdao;
	}


	}
	
	


