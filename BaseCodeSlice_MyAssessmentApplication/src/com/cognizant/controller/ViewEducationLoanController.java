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
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ViewEducationLoanService;



@Controller
public class ViewEducationLoanController {
	
	

	@Autowired
	private ViewEducationLoanService s1;
	
	private List<UserDetails> user;
	@RequestMapping(value = "/viewEducationLoan", method = RequestMethod.GET)
	public String initiateEducationLoan() {
		
	return "viewEducationLoan";
	
	}
	
    @RequestMapping(value="/View1",method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody  List<EducationLoan> geEducationLoans(){
		
	List<EducationLoan> edu;
	edu=s1.retrieveEducationLoanDetails(1234567890987655L);
	System.out.println("13");
	System.out.println(edu);
	return edu;
	
	}
	
	
}
