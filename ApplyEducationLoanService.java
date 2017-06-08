package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.ApplyEducationLoanDAO;
import com.cognizant.dao.viewEducationLoanDAO;
import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.UserDetails;


@Component
public class ApplyEducationLoanService {
	
	@Autowired
	 ApplyEducationLoanDAO dao;	
	viewEducationLoanDAO vld;
	UserDetails userDetails;
	
	public void insertEducationLoanDetails(UserDetails user)               //(User user)
	{  
		
		
		dao.insertEducationLoanDetails(user);
		
	}

	public String generateEduLoanId(long ID_Card_Number) {
		StringBuffer sb=new StringBuffer();
		String s= Long.toString(ID_Card_Number);
		
	//	String s1=Integer.toString(i);
		 sb.append(s);
		 String ELaccNo=sb.toString();
		
		
		String idNumbLast=ELaccNo.substring(0, 5);
		String loanId="EL-".concat(idNumbLast);
		return loanId;
	}
	public long generateLoanAccNumber() {
		Long num=(long) (Math.random() * 10000000000000000L);
		return num;
	}


 @Transactional
	public void update(long acc, EducationLoan e3) {
		
	 UserDetails user=dao.update(acc);
		e3.setUserDtails(user);
		List<EducationLoan> edu=new ArrayList<EducationLoan>();
		edu.add(e3);
		user.setEduList(edu);
	}
}
	 
	