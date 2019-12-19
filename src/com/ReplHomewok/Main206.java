package com.ReplHomewok;

import java.util.TreeMap;

public class Main206 {

	public static void main(String[] args) {
		TreeMap<Integer, Double> tmap=new TreeMap<>();
		tmap.put(1, 1.1);
		tmap.put(2, 2.2);
		tmap.put(3, 3.3);
		tmap.put(4, 4.4);
		tmap.put(5, 5.5);
		
		System.out.println(tmap.containsKey(3));
		System.out.println(tmap.containsValue(4.4));
		System.out.println(tmap.containsKey(6));

	}

}
