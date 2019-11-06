package com.class6;

import java.util.Scanner;

public class ClassTask2 {
public static void main(String[] args) {
	
	
	
	Scanner scan=new Scanner (System.in);
	
	System.out.println("Is there a sale today, True or False");
	
	boolean sale=scan.nextBoolean();
	
	double price;
	double discount;
	double finalPrice;
	
	System.out.println("how much is the item you want to buy");	
	
	price=scan.nextDouble();
	
	if(!sale) {
		System.out.println("I will not be shopping today");
		
	}else {
		
			if(price<20) {
				
			discount=price*0.10;
			finalPrice=price-discount;
			
		}else if(price>=20 && price<=100) {
			discount=price*0.20;
			finalPrice=price-discount;
					
			} else if(price>100 && price<=500) {
				discount=price*0.30;
				finalPrice=price-discount;
				
			}else {
				discount=price*0.50;
				finalPrice=price-discount;
				
			}System.out.println("After discount "+discount+" the price of the item reduced from "+price+" to "+finalPrice);
		}
			
	}
	
	
}

