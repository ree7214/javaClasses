package com.class34;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class HomeWorkQuestion {

	public static void main(String[] args) {
		// How can we remove all duplicates from ArrayList
		
		List<String>alist=new ArrayList<>();
		alist.add("John");
		alist.add("Jane");
		alist.add("James");
		alist.add("Jasmine");
		alist.add("Jane");
		alist.add("James");
		
		 Set<String> setArray = new LinkedHashSet<>(); 
		 setArray.addAll(alist);
		 System.out.println(setArray);
		 alist.clear();
		 System.out.println(setArray);


}
}