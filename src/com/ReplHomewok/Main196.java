package com.ReplHomewok;

import java.util.HashSet;
//import java.util.LinkedHashSet;

public class Main196 {
	public static void main(String[] args) {
		HashSet<String>hset = new HashSet<>();
		hset.add("first");
		hset.add("second");
		hset.add("third");
		hset.add("fourth");
		hset.add("fifth");
		hset.toArray();
		System.out.println("Array elements:");
		for(String h1:hset) {
			System.out.println(h1);
		}
		
//		System.out.println(hset);
//		
//		hset.remove("second");
//		System.out.println(hset);
//		
//		hset.clear();
//		System.out.println(hset);
		
//		HashSet<String>hset2 = new HashSet<>();
//		hset2.add(null);
//		hset2.add("shiva");
//		hset2.add("sandish");
//		hset2.add("asel");
//		hset2.add("sumair");
//
//		System.out.println(hset2);
//		
//		System.out.println(hset2.contains(null));
		
		
		
	}
	
}
