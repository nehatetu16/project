package com.cognizant.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.UserDetails;

@Component
public class PerformTransactionDAO {
	@PersistenceContext
    private EntityManager em;

    @Transactional
	public void addNewUser(UserDetails user1) {
		
		em.persist(user1);
		
		
	}
    @Transactional
	public void performTransaction( long acc,TransactionDetails trans1) {
		UserDetails obj1=em.find(UserDetails.class,acc);
		double result=0.0;
		if(trans1.getTransactionType().equals("deposit"))
{
		
		 result=obj1.getAcconutBalance()+trans1.getTransactionAmount();
		}
		else
		{
			 result=obj1.getAcconutBalance()-trans1.getTransactionAmount();
		}
		
		
		obj1.setAcconutBalance((long) result);
		System.out.println(obj1);
		trans1.setUserDtails(obj1);
		List<TransactionDetails> list=new ArrayList<TransactionDetails>();
		list.add(trans1);
		obj1.setTrans(list);
		
		
		
		
	}
    @Transactional
	public UserDetails retriveDetails(long acc) {
		
		UserDetails obj2=em.find(UserDetails.class, acc);
	    System.out.println(obj2);
		return obj2;
	}
    
    @Transactional
	public void addSingleUser(UserDetails user1) {
            em.persist(user1);
		
	}
	
	
		
		
		
	}
	
	


