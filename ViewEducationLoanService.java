package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.viewEducationLoanDAO;
import com.cognizant.entity.EducationLoan;

import com.cognizant.entity.UserDetails;

@Component
public class ViewEducationLoanService{
	@Autowired
	viewEducationLoanDAO vld;
	
	
	public List<EducationLoan> retrieveEducationLoanDetails(long accountNumber) {
		List<EducationLoan> edu;
		edu=vld.retrieveEducationLoanDetails(accountNumber);
		System.out.println("12" );
		return edu;
	}
	
	
}