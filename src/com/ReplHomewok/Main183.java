package com.ReplHomewok;

public class Main183 {

	public static void main(String[] args) {
			Account obj=new Account();
			obj.setAccno(756050400l);
			obj.setName("Sumair");
			obj.setEmail("sumair@syntaxsolutions.com");
			obj.setAmount(50000.0);
			
			System.out.print(obj.getAccno()+" "+obj.getName()+" "+obj.getEmail()+" "+obj.getAmount());

	}

}
