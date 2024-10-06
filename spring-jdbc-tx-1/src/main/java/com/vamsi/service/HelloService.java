package com.vamsi.service;

import Accountmodel.model.Account;

public interface HelloService {
	
	public  void  withdraw(Account  acc ,  double amt);
	public  void  deposit(Account  acc , double amt);
	public  void transferAmount( Account source , Account dest , double amt);
	


}
