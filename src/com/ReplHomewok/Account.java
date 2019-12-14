package com.ReplHomewok;

public class Account {

	private static long acc_no;
	private static String name;
	private static String email;
	private static double amount;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAccno(long acc_no) {
		this.acc_no = acc_no;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public String getEmail( ) {
		return email;
	}

	public long getAccno( ) {
		return acc_no;
	}

	public double getAmount( ) {
		return amount;

	}
}
