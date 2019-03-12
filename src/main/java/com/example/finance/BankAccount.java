package com.example.finance;

public class BankAccount {
	private Integer accountNo;
	private String accountType;
	private Long accountBalance;
	
	
	public BankAccount() {
		super();
	}
	public BankAccount(Integer accountNo, String accountType, Long accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public Integer getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Long getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Long accountBalance) {
		this.accountBalance = accountBalance;
	}
	

}
