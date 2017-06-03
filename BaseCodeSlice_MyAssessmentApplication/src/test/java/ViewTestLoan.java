package test.java;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cognizant.dao.viewEducationLoanDAO;
import com.cognizant.entity.EducationLoan;

import com.cognizant.service.ViewEducationLoanService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class ViewTestLoan {
	
	@Autowired
	ViewEducationLoanService vls;

	
	
	/*@Before
	public void setup(){
		viewdao=new ViewEducationLoanDAO();
	}*/
	@Test
	public void viewLoanDao() {
		System.out.println("test");
		
		//vls.retrieveEducationLoanDetails(2l);
		//assertTrue(true);
		vls.retrieveEducationLoanDetails(1234567890987655l);
		
	}
}