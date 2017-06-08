package com.cognizant.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.entity.UserDetails;
import com.cognizant.entity.HomeLoanVO;;

@Component
public class ViewHomeLoanDAO {

	@PersistenceContext
	private EntityManager em;

	@Transactional
		public List<HomeLoanVO> retrieveLoanDetails(long accountNumber) {
	UserDetails userDetails=em.find(UserDetails.class,accountNumber);
	
	System.out.println(userDetails.getHomeLoan());

	return userDetails.getHomeLoan();
}

}
