package com.cognizant.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.entity.TransactionDetails;
//import com.cognizant.entity.TransactionDetails;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.PerformTransactionService;

@Controller
public class ViewTransactionController {
	
	@Autowired
	PerformTransactionService service;

	@RequestMapping(value="/viewtransaction", method=RequestMethod.GET)
	public String getTransaction(@RequestParam("accountNumber") long accountNumber,	Model model){
		model.addAttribute("msg", accountNumber);
		return "ViewTransaction";
	}
	
	@RequestMapping(value="/transaction",method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody  List<UserDetails> getEmployees(@RequestParam("accountNumber") long accountNumber) {
		
		
		TransactionDetails obj3=new TransactionDetails();
		
		/*UserDetails ud=new UserDetails(1234567891234567l,"Savings","sangha",2000.0);
		UserDetails ud1=new UserDetails(1234567891234567l,"Savings","Shubham",2000.0); */
		UserDetails ud=new UserDetails();
		
		
		
		ud=service.retriveDetails(accountNumber);
		List<TransactionDetails> li1=new ArrayList<TransactionDetails>();
		List<TransactionDetails> li2=new ArrayList<TransactionDetails>();
		li1=ud.getTrans();
		
		for(int i=0;i<li1.size();i++)
		{
			obj3=null;
			obj3=li1.get(i);
			obj3.setUserDtails(null);
			li2.add(obj3);
		}
		
		
		ud.setTrans(li2);
		
		
		
		
		
		List<UserDetails> li=new ArrayList<UserDetails>();
		li.add(ud);
	//	li.add(ud1);
		return li;
	}
	
}
