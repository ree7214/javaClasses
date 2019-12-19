package com.ReplHomewok;

import java.util.HashSet;

public class Main194And195 {
//repl 194
	public static void main(String[] args) {
		HashSet<String>hset = new HashSet<>();
		hset.add("Red");
		hset.add("Pink");
		hset.add("Yellow");
		hset.add("White");
		hset.add("Black");
		
		System.out.println("Original Hash Set: "+hset);
		System.out.println("Size of Hash Set: "+hset.size());
	
		//repl 195
		HashSet<Integer>hset1 = new HashSet<>();
		
		hset1.add(111);
		hset1.add(111);
		hset1.add(111);
		hset1.add(999);
		hset1.add(999);
		hset1.add(999);
		
		
		for(int h1:hset1) {
			System.out.println(h1);
		}
	}

}
