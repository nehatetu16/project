package com.cognizant.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.controller.ApplyHomeLoanController;
import com.cognizant.dao.ApplyHomeLoanDAO;
import com.cognizant.entity.HomeLoanVO;
import com.cognizant.entity.UserDetails;
import com.cognizant.exception.BankManagementException;

import sun.print.resources.serviceui;

@Component
public class ApplyHomeLoanService {
	static Logger logger = Logger.getLogger(ApplyHomeLoanService.class);
	
	java.sql.Date systemDate = new java.sql.Date(System.currentTimeMillis());
	@Autowired
	private ApplyHomeLoanDAO homeLoanDao;

	public void insertHomeLoanDetails(UserDetails userDetails) throws Exception {


		homeLoanDao.insertHomeLoanDetails(userDetails);

	}
	
	
	@Transactional
	public void updateLoanDetails(long acc, HomeLoanVO h2) {
		
		ApplyHomeLoanService ser=new ApplyHomeLoanService();
	
		String id=ser.generateHomeLoanId(acc);
		
			System.out.println(id);
			
			h2.setHomeLoanId(id);
			//(str == null || str.trim().equals("")
			
		String a=Long.toString(h2.getLoanAmount());
			if(h2.getLoanAmount()<=0 || (a.matches("/^[ A-Za-z_@./#&+-]*$/") || a==null || a.trim().equals("")))
					{
				throw new BankManagementException("loanAmount:Loan Amount should be numeric");

					}
			String b=Long.toString(h2.getAnnualIncome());
			if((b.matches("/^[ A-Za-z_@./#&+-]*$/") || b==null || b.trim().equals("")) )
			{
		throw new BankManagementException("annualIncome:Annual Income should be numeric");

			}
			if(h2.getCompanyName()==null || h2.getCompanyName().trim().equals(""))
					
			{
		throw new BankManagementException("companyName:Please enter valid name");

			}
			if(h2.getDesignation()==null || h2.getDesignation().trim().equals(""))
			{
				throw new BankManagementException("designation:Please enter valid designation");

			}
			if( (h2.getAnnualIncome()*.1)!=((h2.getLoanAmount()))  )
			{
				throw new BankManagementException("loanAmount:Loan Amount should be valid");
			}
			if(h2.getLoanDuration()%5!=0 || h2.getLoanDuration()>20 || h2.getLoanDuration()<=0 )
			{
				throw new BankManagementException("loanDuration:Loan Duration should be valid");
			}
			if(h2.getTotalExperience()<0 || h2.getCurrentExperience()<0)
			{
				throw new BankManagementException("currentExperience:Please enter valid Experience");
	
			}
			
			if(h2.getTotalExperience()<h2.getCurrentExperience())
			{
				throw new BankManagementException("currentExperience:Current experience must be less than total Experience");
			}
			
			/*Date d=h2.getLoanApplyDate();
			if(d.after(systemDate))
			{
				throw new BankManagementException("loanApplyDate:Future date is not allowed");
			}*/
			
			String c=Integer.toString(h2.getTotalExperience());
			if( c.matches("/^[ A-Za-z_@./#&+-]*$/"))
					{
		throw new BankManagementException("totalExperience:It Should Be numeric");
		
					}
			String d1=Integer.toString(h2.getCurrentExperience());
			if(d1.matches("/^[ A-Za-z_@./#&+-]*$/"))
			{
throw new BankManagementException("currentExperience:It Should Be numeric");

			}
		UserDetails userDetails=homeLoanDao.updateLoanDetails(acc);
		
		
		
		h2.setUserDtails(userDetails);
		
		List<HomeLoanVO> h=new ArrayList<HomeLoanVO>();
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

	public boolean validUser(long accountNumber)
	{
		homeLoanDao.validUser(accountNumber);
		
		
		return false;
		
	}
	/*public List<Employee> findEmployeesBySalary(double salary) {
		Query query = em.createQuery("from Employee e where e.salary < ?");
		query.setParameter(1, salary);
		List<Employee> employees = query.getResultList();
		return employees;
	}*/
}
