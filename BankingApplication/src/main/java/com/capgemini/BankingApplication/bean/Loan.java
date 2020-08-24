package com.capgemini.BankingApplication.bean;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Loan extends Account{
	
	private String loanId;
	private double loanAmt;
	
	
	public String getLoanId() {
		return loanId;
	}
	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}
	public double getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(double loanAmt) {
		this.loanAmt = loanAmt;
	}
	
	
	public Loan(double accountBalance, String accountType, String loanId, double loanAmt) {
		super(accountBalance, accountType);
		this.loanId = loanId;
		this.loanAmt = loanAmt;
	}
	public Loan() {
		
	}
	
	

}
