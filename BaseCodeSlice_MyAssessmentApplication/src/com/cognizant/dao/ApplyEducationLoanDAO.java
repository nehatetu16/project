package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.EducationLoan;

import com.cognizant.entity.UserDetails;


@Component
public class ApplyEducationLoanDAO {
	 @PersistenceContext
	    private EntityManager em;

	

	 @Transactional
	public void insertEducationLoanDetails(UserDetails userDetails) {
		// TODO Auto-generated method stub
		//System.out.println("In DAO"+user.getCourse_Name());
		em.persist(userDetails);
		
	}
	 
	 public UserDetails getUserDetails(long accountNumber) {
			// TODO Auto-generated method stub
			
			System.out.println("before dao");
			System.out.println(accountNumber);
			UserDetails user = em.find(UserDetails.class, accountNumber);
			System.out.println(user);
			System.out.println("after dao");
			return user;
			
		}

	public UserDetails update(long acc) {
		
		UserDetails user=em.find(UserDetails.class, acc);
		return user;
		
	}
	

}
