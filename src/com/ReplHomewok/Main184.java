package com.ReplHomewok;

public class Main184 {

	public static void main(String[] args) {
		Person obj = new Person("John", "Doe", 10, 25, 1900, "123-45-6789");
		obj.setFirstname("John");
		obj.setLastname("Doe");
		obj.setBirthmonth(10);
		obj.setBirthday(25);
		obj.setBirthyear(1900);
		obj.setSsn("123-45-6789");
		
		System.out.println(obj.getFirstname());
		System.out.println(obj.getLastname());
		System.out.println(obj.getBirthmonth()+"/"+obj.getBirthday()+"/"+obj.getBirthyear());
		System.out.println(obj.getSsn());
	}
}
