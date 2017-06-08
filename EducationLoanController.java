package com.cognizant.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

//import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cognizant.entity.EducationLoan;
import com.cognizant.entity.UserDetails;
import com.cognizant.service.ApplyEducationLoanService;

@Controller
public class EducationLoanController {

	@Autowired
	// EducationLoan entity;
	ApplyEducationLoanService service;
	private List<EducationLoan> eduList;
	// private List<User> userList;

	@RequestMapping(value = "/applyEducationLoan", method = RequestMethod.GET)
	public String getEducationLoan(@RequestParam("accountNumber") long accountNumber, Model model) {
System.out.println("gtrhrrh" +accountNumber);
		model.addAttribute("msg", accountNumber);
		model.addAttribute("inserEducationLoan", new EducationLoan());
		return "applyEducationLoan";
	}

	@RequestMapping(value = "/applyEducationLoan", method = RequestMethod.POST)
	public String initiateEducationLoan(@ModelAttribute("inserEducationLoan") @Valid EducationLoan educationLoan,
			BindingResult result, @RequestParam("accountNumber") long accountNumber, Model model) {

		// UserDetails userDetails=new UserDetails(1234567890987655l,"Salary",
		// "neha", 5000654); //userList=new ArrayList<User>();

		// eduList = new ArrayList<EducationLoan>();
		// userList= (List<User>) entity.getUser();
		String id = service.generateEduLoanId(educationLoan.getID_Card_Number());
		// String id1=service.generate(e2.getID_Card_Number());
		// System.out.println(id);
		educationLoan.setEducation_Loan_ID(id);
		// educationLoan.setEducation_Loan_ID(id);

		educationLoan.setEdu_Loan_Account_Number(service.generateLoanAccNumber());
		// educationLoan.setEdu_Loan_Account_Number(service.generateLoanAccNumber());
		// educationLoan.setUserDtails(userDetails);
		// eduList.add(educationLoan);

		// EmployeeValidator validator = new EmployeeValidator();

		// Set<ConstraintViolation<Object>> constraintViolations =
		// validator.validate(employee, result);

		// new EmployeeValidator().validate(employee, result);
		try {
			// userDetails.setEduList(eduList);
			service.update(accountNumber, educationLoan);
		} catch (ConstraintViolationException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
			Iterator<ConstraintViolation<?>> iterator = constraintViolations.iterator();
			while (iterator.hasNext()) {
				ConstraintViolation<?> next = iterator.next();
				System.out.println("Validation message: " + next.getMessage());
				System.out.println("Invalid field: " + next.getPropertyPath());
				System.out.println("Validation class/bean: " + next.getRootBean());
				// result.reject(next.getPropertyPath(), next.getMessage());
				result.rejectValue(next.getPropertyPath().toString(), "", next.getMessage());
				// result.rejectValue(arg0, arg1, arg2);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("m1", educationLoan.getEdu_Loan_Account_Number());

		if (result.hasErrors()) {
			return "applyEducationLoan";
		}

		return "member";

	}
}
