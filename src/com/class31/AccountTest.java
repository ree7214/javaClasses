package com.class31;

public class AccountTest {

	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccount(12345678);
		long accountNum=acc.getAccountNumber();
		System.out.println(accountNum);
		
		acc.setBalance(200);
		double myBalance=acc.getBalance();
		System.out.println(myBalance);
		
		
		int num=123;         //"123"
		String.valueOf(num);//converts given number to string & now all string methods are now available.
		

	}

}
