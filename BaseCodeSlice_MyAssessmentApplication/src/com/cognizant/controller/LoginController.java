package com.cognizant.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.entity.HomeLoanVO;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ApplyHomeLoanService;


@Controller
public class LoginController {

	
	@Autowired
 	ApplyHomeLoanService service;
	

 	private List<HomeLoanVO> homeLoan;
	
UserDetails userDetails;
   
    @RequestMapping(value="/loginUser", method=RequestMethod.GET)
 	public String getHomeLoanVO(@ModelAttribute("login") @Valid UserDetails userDetails,
 			BindingResult result, Model model){
    	
    	model.addAttribute("loginUser", new UserDetails());
 		return "loginUser";
 	}
 	
    @RequestMapping(value="/user/{userId}/invoices", method = RequestMethod.GET)
    public List<UserDetails> listUsersInvoices(
                @PathVariable("accountNumber") String accontNumber)
                {
					return null;
      
    }
 	
 	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
 	public String saveOrUpdateHomeLoanVO(
 		@ModelAttribute("login") @Valid UserDetails userDetails,
 		BindingResult result,
 		Model model) {
 		
 		
 		
 		
 		return "member";
 		
 	}
 /*
 		try {
 			long acc=service.generateLoanAccNumber();
 			
 			System.out.println(acc);
 			
 		
 	 		
 	 		homeLoans.setLoanAccountNumber(acc);
 			service.updateLoanDetails(1234567890987655l, homeLoans);
 			
 			
 			
 		} 
 		catch (ConstraintViolationException e) {
 			// TODO Auto-generated catch block
 //			e.printStackTrace();
 			Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
 			Iterator<ConstraintViolation<?>> iterator = constraintViolations.iterator();
 			while(iterator.hasNext()){
 				ConstraintViolation<?> next = iterator.next();
 				System.out.println("Validation message: "+next.getMessage());
 				System.out.println("Invalid field: "+next.getPropertyPath());
 				System.out.println("Validation class/bean: "+next.getRootBean());
 //				 result.reject(next.getPropertyPath(), next.getMessage());
 				result.rejectValue(next.getPropertyPath().toString(), "", next.getMessage());
 //				result.rejectValue(arg0, arg1, arg2);
 			}
 		}
 		catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		model.addAttribute("m1", homeLoans.getHomeLoanId());
 
 		if (result.hasErrors()) {
 			return "applyHomeLoan";
 		} 
 		
 		return "member";
 
 	}
 	
 	
 	
 	
 	
 	
 	
 		@RequestMapping(value="/Add", method=RequestMethod.GET)
 	public String addMember(@RequestParam("homeLoanId") String homeLoanId, Model model,BindingResult result){
 		
 		homeLoan=new ArrayList<>();
 		UserDetails userDetails=new UserDetails(1234567090987655l,"Salary", "neha", 5000654);
 	//long loanAmount, int loanDuration, Date loanApplyDate,
//long annualIncome, String companyName, String designation, int totalExperience, int currentExperience,UserDetails userDetails) {
	
 		Date d1=new Date();
 		HomeLoanVO h1=new HomeLoanVO(54534534,4,d1,265464,"cts","pat",4,3,userDetails);

 		HomeLoanVO h2=new HomeLoanVO(5345434,3,d1,87232,"tcs","pa",4,3,userDetails);
 		

 		h1.setLoanAccountNumber(123456750087655l);
 		//h1.setLoanAccountNumber(service.generateLoanAccNumber());
 		
 		System.out.println(h1);
 		h2.setLoanAccountNumber(123455400655l);
 	//	h2.setLoanAccountNumber(service.generateLoanAccNumber());
 		
 		System.out.println(h1);
 		String id=service.generateHomeLoanId(userDetails.getAccountNumber());
 		
 		//h1.setHomeLoanId(id);
 		//h2.setHomeLoanId(id);
 	 	homeLoan.add(h1);
 	 	
 	 	homeLoan.add(h2);
 		try {
 			
 			userDetails.setHomeLoan(homeLoan);
 			service.insertHomeLoanDetails(userDetails);
 			model.addAttribute("m1", homeLoanId);
 		}
 		catch (ConstraintViolationException e) {
 			// TODO Auto-generated catch block
 //			e.printStackTrace();
 			Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
 			Iterator<ConstraintViolation<?>> iterator = constraintViolations.iterator();
 			while(iterator.hasNext()){
 				ConstraintViolation<?> next = iterator.next();
 				System.out.println("Validation message: "+next.getMessage());
 				System.out.println("Invalid field: "+next.getPropertyPath());
 				System.out.println("Validation class/bean: "+next.getRootBean());
 //				 result.reject(next.getPropertyPath(), next.getMessage());
 				result.rejectValue(next.getPropertyPath().toString(), "", next.getMessage());
 //				result.rejectValue(arg0, arg1, arg2);
 			}
 		}
 		catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		
 		return "member";
 	}*/
}
	
	

