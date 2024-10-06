package com.vamsi.service;

import org.springframework.stereotype.Service;

@Service("hs")
public class HelloServiceImpl implements HelloService {

	@Override
	public double deposite(int accid, double balance) {
		System.out.println("==========deposite ===========");
		return 1000;
	}

	@Override
	public double withdraw(int accid, double balance) {
		System.out.println("==========withdraw==========");
		return 500;
	}

	@Override
	public void transfer(int accid, double balance, double withdrawamount) {
		System.out.println("========trasfer============");
		
	}

	
	
}
