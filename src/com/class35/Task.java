package com.class35;

import java.util.HashMap;

public class Task {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Google");
		map.put(2, "Syntax");
		map.put(4, "Macys");
		map.put(3, "Aamazon");
		map.put(1, "Google");
		map.put(3, "Amazon");
		map.put(7,"Chrome" );
		
		System.out.println(map);
		
		int size=map.size();
		System.out.println(size);
		
		map.replace(4, "Verizon");
		System.out.println(map);
		
		map.remove(7);
		System.out.println(map);
	}

}
