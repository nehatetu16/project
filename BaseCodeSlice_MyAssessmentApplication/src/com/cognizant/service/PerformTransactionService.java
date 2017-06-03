package com.cognizant.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import com.cognizant.dao.PerformTransactionDAO;
import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.UserDetails;
import com.cognizant.exception.BankManagementException;

@Component
public class PerformTransactionService {
@Autowired
PerformTransactionDAO DAO;

	public void addUser(UserDetails user1, TransactionDetails trans) {
		long time= System.currentTimeMillis();
		String time1=Long.toString(time);
		
		String id=time1.substring(0, 10);
		long id1=Long.parseLong(id);
		trans.setTransactionId(id1);
		
		trans.setUserDtails(user1);// used for many-to-one mapping
		
		List<TransactionDetails> list=new ArrayList<TransactionDetails>();
		list.add(trans);
		user1.setTrans(list);
		DAO.addNewUser(user1);
		
	}

	public void performTransaction( long acc,TransactionDetails trans1) {
		
		long time= System.currentTimeMillis();
		String time1=Long.toString(time);
		
		String id=time1.substring(0, 10);
		long id1=Long.parseLong(id);
		
		trans1.setTransactionId(id1);
		
		
		UserDetails ud=DAO.retriveDetails(acc);
		System.out.println(ud);
		
		
		if(trans1.getTransactionType().equals("withdrawal")){
		if(trans1.getTransactionAmount()>ud.getAcconutBalance())
		{
			throw new BankManagementException("AccountBalance should be greater than TransactionAmount");
		}
		
		
		}
		
		if(!trans1.getTransactionType().equals("deposit") && !trans1.getTransactionType().equals("withdrawal") )
		{
			throw new BankManagementException("Transaction Type should be Deposit or Withdrawal");
		}
		
		
		if(ud.getAccountType().equals("savings"))
		{
			if(ud.getAcconutBalance()<5000)
			{
				throw new BankManagementException("Minimum balance in savings account should be greater than 5000");
			}
			
		}
		else
			if(ud.getAccountType().equals("salary"))
			{
				if(ud.getAcconutBalance()<0)
				{
					throw new BankManagementException("Minimum  balance in salary account should be 0");
				}
			}
		
		
		
		
		
		
		DAO.performTransaction(acc,trans1);
		
	}

	public UserDetails retriveDetails(long acc) {
		
		UserDetails obj3=DAO.retriveDetails(acc);
		System.out.println(obj3);
		return obj3;
	}

	public void addSingleUser(UserDetails user1) {
		
		
		if(user1.getAccountType().equals("Savings"))
		{
			if(user1.getAcconutBalance()<5000)
			{
				throw new BankManagementException("Minimum balance in savings account should be greater than 5000");
			}
			
		}
		else
			if(user1.getAccountType().equals("Salary"))
			{
				if(user1.getAcconutBalance()<0)
				{
					throw new BankManagementException("Minimum  balance in salary account should be 0");
				}
			}
		
		DAO.addSingleUser(user1);
		
	}
	
	

	

	
}
