package com.class24;

public class Country {
	
	public String capital, name;
	
	
	Country(){
		System.out.println("I am non argument constructor");
	}
	
	Country(String countryName, String countryCapital){
	name=countryName;
	capital=countryCapital;
	
	}
	public void displayInfo() {
		System.out.println(name+" "+capital);
	}
	
	public static void main(String[] args) {
		Country country1=new Country("USA","Washington DC");
		country1.displayInfo();
		
		Country country2=new Country("Kazakhstan", "Astana");
		country2.displayInfo();
		
		Country country3=new Country();
		country3.displayInfo();
	}

}
