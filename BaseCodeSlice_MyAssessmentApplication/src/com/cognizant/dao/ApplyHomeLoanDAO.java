package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.HomeLoanVO;
import com.cognizant.entity.UserDetails;

@Component
public class ApplyHomeLoanDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void insertHomeLoanDetails(UserDetails userDetails) {

	
		em.persist(userDetails);
	
	}
	

	public UserDetails updateLoanDetails(long acc) {
	UserDetails userDetails=em.find(UserDetails.class,acc);
	return userDetails;
	
	}


	

}
