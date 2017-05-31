package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.ApplyHomeLoanDAO;
import com.cognizant.dao.ViewHomeLoanDAO;
import com.cognizant.entity.UserDetails;


@Component
public class ViewHomeLoanService {
	@Autowired
	private	ViewHomeLoanDAO homeLoanDao;
	
	public void retrieveLoanDetails(long loanAccountNumber) {
		
		UserDetails userDetails=new UserDetails();
		
	
		userDetails=homeLoanDao.retrieveLoanDetails( loanAccountNumber);
		System.out.println("ghfghfgh  "  +userDetails);
		System.out.println(userDetails.getHomeLoan());
		
		
		
		
	}


}
