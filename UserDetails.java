
package com.cognizant.entity;

import java.util.List;
import java.util.Random;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;




@Entity
public class UserDetails {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ACCOUNT_NUMBER")
		long accountNumber;
	String accountType;
	String accountHolderName;
	long acconutBalance;
	
	@JsonManagedReference  
	@OneToMany(mappedBy = "userDtails", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<HomeLoanVO> homeLoan;
	
	public  UserDetails(){}  
	
	@JsonManagedReference
	@OneToMany(mappedBy = "userDtails", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<EducationLoan> eduList;
	
	
	@JsonManagedReference
	@OneToMany(mappedBy = "userDtails", cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	private List<TransactionDetails> trans;
	
	/*public UserDetails(long accountNumber, String accountType, String accountHolderName, long acconutBalance,
			List<TransactionDetails> trans) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.acconutBalance = acconutBalance;
		this.trans = trans;
	}*/
	public List<TransactionDetails> getTrans() {
		return trans;
	}
	public void setTrans(List<TransactionDetails> trans) {
		this.trans = trans;
	}
	public List<EducationLoan> getEduList() {
		return eduList;
	}

	public void setEduList(List<EducationLoan> eduList) {
		this.eduList = eduList;
	}
	public List<HomeLoanVO> getHomeLoan() {
			return homeLoan;
		}
		public void setHomeLoan(List<HomeLoanVO> homeLoan) {
			this.homeLoan = homeLoan;
		}
		@OneToMany(fetch=FetchType.LAZY)
		@JoinColumn(name="ACCOUNT_NUMBER")
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		

		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public long getAcconutBalance() {
		return acconutBalance;
	}

	public void setAcconutBalance(long acconutBalance) {
		this.acconutBalance = acconutBalance;
	}
	
	public UserDetails(long accountNumber,String accountType, String accountHolderName, long acconutBalance
			) {
		super();
	this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.acconutBalance = acconutBalance;
		//this.homeLoan = homeLoan;
	}
	
	
	public UserDetails(long accountNumber, String accountType, String accountHolderName, long acconutBalance,
			List<EducationLoan> eduList) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.acconutBalance = acconutBalance;
		this.eduList = eduList;
	}
	
	public UserDetails(Long accountNumber, String accountType, String accountHolderName, long acconutBalance,
			List<TransactionDetails> trans) {
		super();
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountHolderName = accountHolderName;
		this.acconutBalance = acconutBalance;
		this.trans = trans;
	}
	@Override
	public String toString() {
		return "UserDetails [accountNumber=" + accountNumber + ", accountType=" + accountType + ", accountHolderName="
				+ accountHolderName + ", acconutBalance=" + acconutBalance + ", homeLoan=" + homeLoan + ", eduList="
				+ eduList + ", trans=" + trans + "]";
	}
	
	
}
