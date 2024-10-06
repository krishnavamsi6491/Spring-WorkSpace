package com.vamsi.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class HellorepositoryImpl implements HelloRepository {
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public void updateAccountBalanceByDeposit(int accid, double amt) {
		template.update("update account set balance = balance + ? where accid = ?" , amt, accid);
		
	}

	@Override
	public void updateAccountBalanceByWithdraw(int accid, double amt) {
		template.update("update account set balance = balance-? where accid= ?" , amt, accid);
		
	}

}
