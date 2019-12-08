package com.class31;

public class Registration {
	
	private String username;
	private String email;
	private String password;
	public String getUsername() {
		return username;
	}
	public String getEmail () {
		return email;
	}
	public String getPasword() {
		return password;
	}
	public void setUsername(String username) {
		if(username.length()>6 && !(username.isEmpty())) {
			System.out.println(username);
		}else {
			System.out.println("invalid username");
		}
		this.username=username;
	}
	public void setEmail(String email) {
		if(email.contains("gmail")) {
			System.out.println(email);
		}else {
			System.out.println("invalid email");
		}
		this.email=email;
	}
	public void setPasword (String password,String username) {
		if(password.contains("username")) {
			System.out.println("invalid password");
		}else {
			System.out.println(password);
		}
		this.password=password;
	}
	}


