package com.vamsi.DAO;

public interface HelloRepository {
	
		public void updateAccountBalanceByDeposit(int accid , double amt);
		public void updateAccountBalanceByWithdraw(int accid , double amt);
	}

