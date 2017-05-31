package com.cognizant.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.dao.ApplyHomeLoanDAO;
import com.cognizant.entity.HomeLoanVO;
import com.cognizant.entity.UserDetails;

@Component
public class ApplyHomeLoanService {

	@Autowired
	private ApplyHomeLoanDAO homeLoanDao;

	public void insertHomeLoanDetails(UserDetails userDetails) throws Exception {

		homeLoanDao.insertHomeLoanDetails(userDetails);

	}
	
	
	@Transactional
	public void updateLoanDetails(long acc, HomeLoanVO h2) {
		
		UserDetails userDetails=homeLoanDao.updateLoanDetails(acc);
		
		h2.setUserDtails(userDetails);
		
		List<HomeLoanVO> h=new ArrayList<>();
		h.add(h2);
		userDetails.setHomeLoan(h);
	}

	public String generateHomeLoanId(long accountNumber) {

		System.out.println(accountNumber);

		StringBuffer sb = new StringBuffer();
		String s1 = Long.toString(accountNumber);

		System.out.println(s1);

		sb.append(s1);
		String lan = sb.toString();
		System.out.println(lan);
		String accNoFirst = lan.substring(13, 16);
		System.out.println(accNoFirst);
		String homeLoanId = "HL-".concat(accNoFirst);

		return homeLoanId;

	}

	public long generateLoanAccNumber() {
		Long num = (long) (Math.random() * 10000000000000000L);
		return num;
	}

	

}
