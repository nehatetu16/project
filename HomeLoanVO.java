
package com.cognizant.entity;

import java.util.Date;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


import com.cognizant.entity.UserDetails;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
//@Table(name="Home_Loan_Details")
public class HomeLoanVO {

	
	
	//@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	String homeLoanId;
	

	Long loanAmount;
	

	 Integer loanDuration;

	 
	Date loanApplyDate;
	

	 Long annualIncome;

	 String companyName;
	 

	 String designation;
	 

	 Integer totalExperience;
	 

	 Integer currentExperience;
	 
	 @Id
	// @GeneratedValue(strategy=GenerationType.AUTO )
	 Long loanAccountNumber;

	

public Long getLoanAccountNumber() {
		return loanAccountNumber;
	}
	public void setLoanAccountNumber(Long loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}


@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	 @JoinColumn(name = "ACCOUNT_NUMBER")
		private UserDetails userDtails;
	 
	 public UserDetails getUserDtails() {
		return userDtails;
	}
	public void setUserDtails(UserDetails userDtails) {
		this.userDtails = userDtails;
	}



	public String getHomeLoanId() {
		return homeLoanId;
	}
	public void setHomeLoanId(String homeLoanId) {
		this.homeLoanId = homeLoanId;
	}
	public Long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public Integer getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(Integer loanDuration) {
		this.loanDuration = loanDuration;
	}
	public Date getLoanApplyDate() {
		return loanApplyDate;
	}
	public void setLoanApplyDate(Date loanApplyDate) {
		this.loanApplyDate = loanApplyDate;
	}
	public Long getAnnualIncome() {
		return annualIncome;
	}
	public void setAnnualIncome(Long annualIncome) {
		this.annualIncome = annualIncome;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Integer getTotalExperience() {
		return totalExperience;
	}
	public void setTotalExperience(Integer totalExperience) {
		this.totalExperience = totalExperience;
	}
	public Integer getCurrentExperience() {
		return currentExperience;
	}
	public void setCurrentExperience(Integer currentExperience) {
		this.currentExperience = currentExperience;
	}
	@Override
	public String toString() {
		return "HomeLoan [homeLoanId=" + homeLoanId + ", loanAmount=" + loanAmount + ", loanDuration=" + loanDuration
				+ ", loanApplyDate=" + loanApplyDate + ", annualIncome="
				+ annualIncome + ", companyName=" + companyName + ", designation=" + designation + ", totalExperience="
				+ totalExperience + ", currentExperience=" + currentExperience + "]";
	}
/*	public HomeLoanVO( long loanAmount, int loanDuration, Date loanApplyDate,
			long annualIncome, String companyName, String designation, int totalExperience, int currentExperience,UserDetails userDetails) {
		super();
	
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.loanApplyDate = loanApplyDate;
		this.annualIncome = annualIncome;
		this.companyName = companyName;
		this.designation = designation;
		this.totalExperience = totalExperience;
		this.currentExperience = currentExperience;
		this.userDtails=userDetails;
	}*/
	
	public HomeLoanVO(Long loanAmount, Integer loanDuration, Date loanApplyDate, Long annualIncome, String companyName,
			String designation, Integer totalExperience, Integer currentExperience, UserDetails userDtails) {
		super();
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.loanApplyDate = loanApplyDate;
		this.annualIncome = annualIncome;
		this.companyName = companyName;
		this.designation = designation;
		this.totalExperience = totalExperience;
		this.currentExperience = currentExperience;
		this.userDtails = userDtails;
	}
	public HomeLoanVO(Long loanAmount, Integer loanDuration, Date loanApplyDate, Long annualIncome, String companyName,
		String designation, Integer totalExperience, Integer currentExperience) {
	super();
	this.loanAmount = loanAmount;
	this.loanDuration = loanDuration;
	this.loanApplyDate = loanApplyDate;
	this.annualIncome = annualIncome;
	this.companyName = companyName;
	this.designation = designation;
	this.totalExperience = totalExperience;
	this.currentExperience = currentExperience;
}
	/*public HomeLoanVO( long loanAmount, int loanDuration, Date loanApplyDate,
			long annualIncome, String companyName, String designation, int totalExperience, int currentExperience) {
		super();
	
		this.loanAmount = loanAmount;
		this.loanDuration = loanDuration;
		this.loanApplyDate = loanApplyDate;
		this.annualIncome = annualIncome;
		this.companyName = companyName;
		this.designation = designation;
		this.totalExperience = totalExperience;
		this.currentExperience = currentExperience;
		//this.userDtails=userDetails;
	}*/
	
	  
	public HomeLoanVO(){}	
}


