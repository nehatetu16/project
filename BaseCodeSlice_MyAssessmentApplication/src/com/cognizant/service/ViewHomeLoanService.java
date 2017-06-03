package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cognizant.dao.ApplyHomeLoanDAO;
import com.cognizant.dao.ViewHomeLoanDAO;
import com.cognizant.entity.HomeLoanVO;
import com.cognizant.entity.UserDetails;


@Component
public class ViewHomeLoanService {
	@Autowired
	private	ViewHomeLoanDAO homeLoanDao;
	
	public List<HomeLoanVO> retrieveLoanDetails(long accountNumber) {
		
		UserDetails userDetails=new UserDetails();
		
		List<HomeLoanVO> homeLoan;
		
		//List<HomeLoanVO> homeLoan;
		homeLoan=homeLoanDao.retrieveLoanDetails(accountNumber);
		System.out.println("ghfghfgh  "  +userDetails);
		System.out.println(userDetails.getHomeLoan());
		return homeLoan;
		
		
		
		
	}


}
