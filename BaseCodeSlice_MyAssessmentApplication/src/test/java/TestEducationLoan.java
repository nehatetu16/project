package test.java;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.dao.viewEducationLoanDAO;
import com.cognizant.entity.EducationLoan;

import com.cognizant.entity.UserDetails;
import com.cognizant.service.ApplyEducationLoanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class TestEducationLoan {

	
	@Autowired
	ApplyEducationLoanService service;
	private List<EducationLoan> eduLoan;
	UserDetails user;
	EducationLoan el;
	@Before
	public void setup(){
		user=new UserDetails(1234567890987655l,"Salary", "neha", 5000654);
		
		EducationLoan e1=new EducationLoan();
		    EducationLoan e2=new EducationLoan(5678,2009,"23-03-1995",20,40000,60000,"C#","abc",5678,user);
		    String id=service.generateEduLoanId(user.getAccountNumber());
		  
		    
		    //String education_Loan_ID, long edu_Loan_Account_Number, double edu_Loan_Amount,
			//String loan_Apply_Date, int edu_Loan_Duration, double father_Annual_Income, double course_Fee,
			//String course_Name, String father_Name, long iD_Card_Number, UserDetails userDtails    
		    
		    e2.setEdu_Loan_Account_Number(service.generateLoanAccNumber()); 
		    eduLoan = new ArrayList<EducationLoan>();
		    e2.setEducation_Loan_ID(id);
		    eduLoan.add(e2);
	
			
			
		    
		    
		    user.setEduList(eduLoan);
		
	}
	@Test
	public void testinsertEducationLoanDetails(){
		try {
			
		
			service.insertEducationLoanDetails(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		//	fail("Not supplied valid name");
		}
	}

	
}
