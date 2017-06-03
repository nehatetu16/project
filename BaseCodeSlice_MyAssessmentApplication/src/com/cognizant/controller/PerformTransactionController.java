package com.cognizant.controller;

import java.util.Iterator;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;

import javax.validation.Valid;

//import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.entity.TransactionDetails;
import com.cognizant.service.PerformTransactionService;
//import javax.validation.ConstraintViolation;
//import javax.validation.ConstraintViolationException;
//import javax.validation.Valid;

@Controller
public class PerformTransactionController {
	
	@Autowired
	PerformTransactionService service;
	
	
	
	@RequestMapping(value="/performtransaction", method=RequestMethod.GET)
	public String getTransaction(@ModelAttribute("transaction") @Valid TransactionDetails transaction,
			BindingResult result, Model model){
		
		return "PerformTransaction";
	}
	
	@RequestMapping(value ="/performtransaction", method = RequestMethod.POST)
	public String performTransaction1(@ModelAttribute("transaction") @Valid TransactionDetails transaction,
	BindingResult result, 
	Model model) {
	
	System.out.println(transaction);
	
	try {
		long acc=9876543212349860l;
	service.performTransaction(acc,transaction);
	
	
	} 
	
	catch (ConstraintViolationException e) {

		Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
		Iterator<ConstraintViolation<?>> iterator = constraintViolations.iterator();
		while(iterator.hasNext()){
			ConstraintViolation<?> next = iterator.next();
			System.out.println("Validation message: "+next.getMessage());
			System.out.println("Invalid field: "+next.getPropertyPath());
			System.out.println("Validation class/bean: "+next.getRootBean());
//			 result.reject(next.getPropertyPath(), next.getMessage());
			result.rejectValue(next.getPropertyPath().toString(), "", next.getMessage());
//			result.rejectValue(arg0, arg1, arg2);
		}
	}
	catch (Exception e) {
		
		e.printStackTrace();
	}
	model.addAttribute("m1", transaction.getTransactionId());

	if (result.hasErrors()) {
		return "PerformTransaction";
	} 
	
	return "member";

}


}
