package com.cognizant.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.log4j.Logger;

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

import com.cognizant.entity.HomeLoanVO;
import com.cognizant.entity.UserDetails;
import com.cognizant.exception.BankManagementException;
import com.cognizant.service.ApplyHomeLoanService;


@Controller
public class ApplyHomeLoanController {
	static Logger logger = Logger.getLogger(ApplyHomeLoanController.class);
	
	@Autowired
 	ApplyHomeLoanService service;
	

private List<HomeLoanVO> homeLoan;
	
UserDetails userDetails;
   
    @RequestMapping(value="/applyHomeLoan", method=RequestMethod.GET)
 	public String getHomeLoanVO(@ModelAttribute("applyHomeLoan") @Valid HomeLoanVO homeLoans,
 			@RequestParam("accountNumber") long accountNumber,	BindingResult result, Model model){
    	
    	model.addAttribute("applyHomeLoan", new HomeLoanVO()); 
    	model.addAttribute("accNo", accountNumber);
 		return "applyHomeLoan";
 	}
 	
 
 	
 	@RequestMapping(value = "/applyHomeLoan", method = RequestMethod.POST)
 	public String saveOrUpdateHomeLoanVO(
 		@ModelAttribute("applyHomeLoan") @Valid HomeLoanVO homeLoans,@RequestParam("accountNumber") long accountNumber,
 		BindingResult result, 
 		Model model) {
 		
 		
 		/*String id=service.generateHomeLoanId(userDetails.getAccountNumber());
 		homeLoans.setHomeLoanId(id);
long acc=service.generateLoanAccNumber();
 		
 		homeLoans.setLoanAccountNumber(acc);*/
 	 	

 		try {
 			long acc=service.generateLoanAccNumber();
 			
 			System.out.println(acc);
 			
 		
 	 		
 	 		homeLoans.setLoanAccountNumber(acc);
 			service.updateLoanDetails(accountNumber, homeLoans);
 			
 			
 			
 		} 
 /*		catch (ConstraintViolationException e) {
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
 		}*/
 		catch (BankManagementException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 			logger.error("Validation message: "+e.getMessage());
			String sb = e.getMessage();
			String sb1[] = sb.split(":");
			
			result.rejectValue(sb1[0],"", sb1[1]);
			
 		}
 		model.addAttribute("m1", homeLoans.getHomeLoanId());
 
 		if (result.hasErrors()) {
 			return "applyHomeLoan";
 		} 
 		
 		return "member";
 
 	}
 	

}
	
	

