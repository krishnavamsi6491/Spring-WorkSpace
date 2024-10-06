package com.vamsi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.vamsi.DAO.HelloRepository;

//import org.springframework.transaction.support.AbstractPlatformTransactionManager;

import Accountmodel.model.Account;

@Service
public class HelloServiceImpl implements HelloService {
	
	@Autowired
	private HelloRepository repo;
	
	@Autowired
	private PlatformTransactionManager  tansactionManager;

	@Override
	public void withdraw(Account acc, double amt) {
		
		TransactionStatus transactionStatus = tansactionManager.getTransaction(new DefaultTransactionDefinition());

		try {
			repo.updateAccountBalanceByWithdraw(acc.getAccid(), amt);
			tansactionManager.commit(transactionStatus);
		} catch (Exception e) {
			e.printStackTrace();
			tansactionManager.rollback(transactionStatus);
		}
}

	@Override
	public void deposit(Account acc, double amt) {
		TransactionStatus transactionStatus = tansactionManager.getTransaction(new DefaultTransactionDefinition());

		try {
			repo.updateAccountBalanceByWithdraw(acc.getAccid(), amt);
			tansactionManager.commit(transactionStatus);
		} catch (Exception e) {
			e.printStackTrace();
			tansactionManager.rollback(transactionStatus);
		}

	}

	@Override
	public void transferAmount(Account source, Account dest, double amt) {
		TransactionStatus transactionStatus = tansactionManager.getTransaction(new DefaultTransactionDefinition());

		try {
			repo.updateAccountBalanceByDeposit(source.getAccid(), amt);
			repo.updateAccountBalanceByWithdraw(source.getAccid(), amt);

			withdraw(source, amt);
			deposit(dest, amt);
			tansactionManager.commit(transactionStatus);
			
		}
		catch(Exception e){
			e.printStackTrace();
		
			tansactionManager.rollback(transactionStatus);
			
		}
		
		}

	}


