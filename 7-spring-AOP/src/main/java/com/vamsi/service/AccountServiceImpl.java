package com.vamsi.service;



public class AccountServiceImpl implements AccountService {


	@Override
	public double deposite(int accid, double balance) {
		
		System.out.println("deposite method");
		return 500;
	}

	@Override
	public double withdraw(int accid, double balance) {
		System.out.println("withdraw method");
	//	throw new RuntimeException("Something went wrong");
		return 1000;
	}

	@Override
	public void transfer(int srcaccid, int destaccid, double balance) {
		System.out.println("transfer method");
		throw new RuntimeException("Something went wrong");
		

	}

}
