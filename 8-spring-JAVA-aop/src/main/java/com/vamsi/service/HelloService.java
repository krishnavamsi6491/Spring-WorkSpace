package com.vamsi.service;

public interface HelloService {
	
	public double deposite(int accid,double balance);
	public double withdraw(int accid,double balance);
	public void transfer(int accid,double balance,double withdrawamount);

}
