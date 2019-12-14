package com.class32;

import java.util.ArrayList;

public class Task {
//Arry list can have Generic or non generic
	public static void main(String[] args) {
		//Generic
		ArrayList<String>arrayList=new ArrayList<>();
		arrayList.add("Daniel");
		arrayList.add("Matt");
		arrayList.add("Amanda");
		arrayList.add("Maria");
		arrayList.add("Mike");
		
		System.out.println(arrayList.isEmpty());
		// Non Generic
		ArrayList alist=new ArrayList();
		alist.add("hello");
		alist.add(100);
		alist.add(15);
		alist.add('M');
		
		System.out.println(alist);
		
			
		
	}
	


}
