package com.class22;

public class AccessingStaticVariables {
	
	
	public static void main(String[] args) {
		Husky obj=new Husky();
		System.out.println(obj.name);//without assigning the name 
		obj.name="Shark";
		System.out.println(obj.name);
		
		System.out.println(Husky.breed);
		System.out.println(obj.breed);// possible but not preferred way
	}	
 }
