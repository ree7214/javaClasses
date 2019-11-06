package com.class3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		double d=12;
		System.out.println(d);

		// int i=12.0; compile time error (looking for double)
		
		// Casting - changing /converting one type to another
		
		//Widening (Implicit-Automatic) & Narrowing (Explicit/Manual)
		
		//byte-->short-->int-->long-->float-->double-->
		
		 
		byte b=127;	
		int i=b;
		  
		
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		//Narrowing (Explicit/Manual)
		// double-->float-->long-->short-->byte
		
		double d2=123.56;
		int num2=(int)d2; // <---only use ( )for narrowing - forcing
		System.out.println(num2);
		
		int num3=1000;
		byte b1=(byte)num3;
		System.out.println(b1);// <----<---only use ( )for narrowing - forcing
		
		
		
		
		
	}

}
