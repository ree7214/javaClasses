package com.class31;

public class Account {
	
	private long accountNumber;
	private double balance;
	//getters
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		
		return balance;
	}
	
	//setter
	public void setBalance(int amount) {
		if(amount>0) {
		balance=balance+amount;
	}
	}
	public void setAccount(long accountNumber) {
		this.accountNumber=accountNumber;
	}


}
