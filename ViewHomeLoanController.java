package com.cognizant.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.entity.HomeLoanVO;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ViewHomeLoanService;

@Controller
public class ViewHomeLoanController {

	@Autowired
  ViewHomeLoanService service;
	
	
	private List<UserDetails> userDetails;
	
	
	
	
	@RequestMapping(value="/viewHomeLoan",method=RequestMethod.GET )
	public String getHomeLoanVO(@RequestParam("accountNumber") long accountNumber,	Model model)
			{
    	
    
    	model.addAttribute("msg", accountNumber);		
	
		
		return "viewHomeLoan";
	}
	
			
	/*@RequestMapping(value="/viewHomeLoan1",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody  List<UserDetails> getUserDetails(){
		
	
		
		UserDetails userDetails1=new UserDetails(1234567090987123l,"Salary", "neha", 5000654);
		
		UserDetails userDetails2=new UserDetails(1234567090987345l,"Savings", "priya", 5055543);
		
		userDetails =new ArrayList<>();
		userDetails.add(userDetails1);
		userDetails.add(userDetails2);
		System.out.println(userDetails);
		return userDetails;
	}*/
	
	
	
	@RequestMapping(value="/viewHomeLoan1",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)

	public @ResponseBody  List<HomeLoanVO> getHomeLoanDetails(@RequestParam("accountNumber") long accountNumber){
		
	List<HomeLoanVO> homeLoan;
		
	homeLoan=service.retrieveLoanDetails(accountNumber);
	
	
		/*UserDetails userDetails1=new UserDetails(1234567090987123l,"Salary", "neha", 5000654);
		
		UserDetails userDetails2=new UserDetails(1234567090987345l,"Savings", "priya", 5055543);
		*/
	/*	userDetails =new ArrayList<>();
		userDetails.add(userDetails1);
		userDetails.add(userDetails2);
		System.out.println(userDetails);*/
		return homeLoan;
	}
	
	
	
	
	
	
	
}
