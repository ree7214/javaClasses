package com.class35;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		HashMap<String, String> countries=new HashMap<>();
		countries.put("USA", "Washington DC");
		countries.put("Austria", "Vienna");
		countries.put("Belgium", "Brussels");
		countries.put("Colombia", "Bogota");
		countries.put("Italy", "Rome");
		
		Set<String> cntry=countries.keySet();
		System.out.println("-----1st way----------");
		for(String c:cntry) {
			System.out.println(c+":"+countries.get(c));
		}
		System.out.println("-----2nd way----------");
		Iterator<String>cntryIterator=cntry.iterator();
		
		while(cntryIterator.hasNext()) {
	//		Entry<String,String>c1=cntryIterator.next();
			
		}
	//	for(Map.Entry<String, String> entry:countries.entrySet();
	//	System.out.println("key"+entry.getKey()+" "+"value "+entry.getValue());
		
	}

}
