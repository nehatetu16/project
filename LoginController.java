package com.cognizant.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.dao.ApplyHomeLoanDAO;

import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.UserDetails;
@Controller
public class LoginController {
	@Autowired
	ApplyHomeLoanDAO dao;
	@RequestMapping(value = "/viewHomePage", method = RequestMethod.GET)
	
	public String getEducationLoan(Model model,@RequestParam("accountNumber") String accountNumber) {
		//model.addAttribute("userDetails", new UserDetails());
		System.out.println(" AccNo=" + accountNumber);
		System.out.println("in home");
		model.addAttribute("msg", accountNumber);

		return "viewHomePage";
	}
	@RequestMapping(value="/homepage",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody  List<UserDetails> getList(@RequestParam("accountNumber") String msg,Model model){
		//String accNum=request.getParameter("AccNo");
		//System.out.println(" AccNo=" + AccNo);
		System.out.println("in login cn" +msg);
		model.addAttribute("accountNumber", msg);
	long accountNumber=Long.parseLong(msg);
	System.out.println(msg);
	System.out.println(accountNumber);
	//long accountNumber=1234567890123456l;
		UserDetails userDetails=dao.getUserDetails( accountNumber);
		
	List<UserDetails> List=new ArrayList<UserDetails>();
	userDetails.setHomeLoan(null);
	userDetails.setTrans(null);
	userDetails.setEduList(null);
	List.add(userDetails);

		return List;
	}

}
