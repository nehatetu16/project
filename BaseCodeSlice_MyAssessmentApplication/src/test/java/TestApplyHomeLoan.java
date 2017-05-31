package test.java;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.entity.HomeLoanVO;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ApplyHomeLoanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")


public class TestApplyHomeLoan {
	@Autowired
	ApplyHomeLoanService service;
	//private List<UserDetails> userDetails;
	
	private List<HomeLoanVO> homeLoan;
	
	private UserDetails userDetails;
	
		@Before
	 	public void setup(){
		
			userDetails=new UserDetails(1234567890987655l,"Salary", "neha", 5000654);
			
			HomeLoanVO h1=new HomeLoanVO(54534534,4,"23/03/2013",265464,"cts","pat",4,3,userDetails);
		
			HomeLoanVO h2=new HomeLoanVO(5345434,3,"24/03/2014",87232,"tcs","pa",4,3,userDetails);
			
			homeLoan=new ArrayList<HomeLoanVO>();
			
			
			
			h1.setLoanAccountNumber(service.generateLoanAccNumber());
			
			h2.setLoanAccountNumber(service.generateLoanAccNumber());
			String id=service.generateHomeLoanId(userDetails.getAccountNumber());
			
			h1.setHomeLoanId(id);
			h2.setHomeLoanId(id);
		 	homeLoan.add(h1);
		 	
		 	homeLoan.add(h2);
		 //long loanAmount, int loanDuration, String loanApplyDate,
		//	long annualIncome, String companyName, String designation, int totalExperience, int currentExperience,
			//UserDetails userDetails) {
					
	 	}

	//	@Test
	 	public void testInsertHomeLoanDetails() {
	 		
	 			try {
	 				System.out.println("ittest");
	 				userDetails.setHomeLoan(homeLoan);
					service.insertHomeLoanDetails(userDetails);
					System.out.println(homeLoan);
					System.out.println("after test");
				} catch (Exception e) {
					
					e.printStackTrace();
				}
	 		
	 			
	 		
	 	}
@Test
		public void testUpdateLoanDetails()
		{
	long acc=1234567890987655l;
	
	HomeLoanVO h3=new HomeLoanVO(5345434,3,"24/03/2014",87232,"tcs","pa",4,3);
	
	h3.setLoanAccountNumber(service.generateLoanAccNumber());
	
	
	String id=service.generateHomeLoanId(userDetails.getAccountNumber());
	
	h3.setHomeLoanId(id);
			service.updateLoanDetails(acc,h3);
		}


	
}
