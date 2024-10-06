package com.vamsi.repository;

import org.springframework.stereotype.Repository;

@Repository("pdao1")
public class personDAO {

	public personDAO() {
		System.out.println("personDAO constructor");
	}
}
