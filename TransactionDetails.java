package com.cognizant.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class TransactionDetails {
	@Id
	long transactionId;
	
	//@NotEmpty
	
	String transactionDescription;
	
	
	//@NotNull
	String transactionType;
	//long accountNumber;
	
	//@NotNull
	//@Range(min=1,max=999999999999999l,message="amount should be valid")
	double transactionAmount;

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

	


public TransactionDetails(long transactionId, String transactionDescription, String transactionType) {
		super();
		this.transactionId = transactionId;
		this.transactionDescription = transactionDescription;
		this.transactionType = transactionType;
	}

public TransactionDetails(long transactionId, String transactionDescription, String transactionType,
			 double transactionAmount, UserDetails user) {
		super();
		this.transactionId = transactionId;
		this.transactionDescription = transactionDescription;
		this.transactionType = transactionType;
		
		this.transactionAmount = transactionAmount;
		this.userDtails = user;
	}

public TransactionDetails(String transactionDescription, String transactionType, double transactionAmount) {
	super();
	this.transactionDescription = transactionDescription;
	this.transactionType = transactionType;
	this.transactionAmount = transactionAmount;
}



public TransactionDetails()
	{
		
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	
	


	public TransactionDetails(Long transactionId, String transactionDescription, String transactionType,
			 double accountBalance) {
		super();
		this.transactionId = transactionId;
		this.transactionDescription = transactionDescription;
		this.transactionType = transactionType;
		
		this.transactionAmount = accountBalance;
	}

	

	@Override
	public String toString() {
		return "TransactionDetails [transactionId=" + transactionId + ", transactionDescription="
				+ transactionDescription + ", transactionType=" + transactionType + ", transactionAmount="
				+ transactionAmount + "]";
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	

}
