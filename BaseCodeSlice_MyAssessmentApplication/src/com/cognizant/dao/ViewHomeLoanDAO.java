package com.cognizant.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.UserDetails;


@Component
public class ViewHomeLoanDAO {

	@PersistenceContext
	private EntityManager em;

	@Transactional
		public UserDetails retrieveLoanDetails(long loanAccountNumber) {
	UserDetails userDetails=em.find(UserDetails.class,loanAccountNumber);
	
	System.out.println(userDetails.getHomeLoan());

	return userDetails;
}

}
