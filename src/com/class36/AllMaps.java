package com.class36;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		
		Map<Integer, String> hashMap=new HashMap<>();
		hashMap.put(1, "Monday");
		hashMap.put(2, "Tuesday");
		hashMap.put(3, "Wednesday");
		hashMap.put(5, "Thursday");
		hashMap.put(8, "Friday");
		hashMap.put(null, "Saturay");
		hashMap.put(9, null);
		hashMap.put(10, null);
		
		System.out.println(hashMap);
		
		Map<Integer, String> LLinkedhashMap=new LinkedHashMap<>();
		LLinkedhashMap.put(1, "Monday");
		LLinkedhashMap.put(2, "Tuesday");
		LLinkedhashMap.put(3, "Wednesday");
		LLinkedhashMap.put(5, "Thursday");
		LLinkedhashMap.put(8, "Friday");
		LLinkedhashMap.put(null, "Saturay");
		LLinkedhashMap.put(9, null);
		LLinkedhashMap.put(10, null);
		
		System.out.println(LLinkedhashMap);

		Map<Integer, String> treeMap=new TreeMap<>();
		treeMap.put(1, "Monday");
		treeMap.put(9, null);
		treeMap.put(2, "Tuesday");
		treeMap.put(5, "Thursday");
		treeMap.put(3, "Wednesday");
		treeMap.put(5, "Thursday");
	//	treeMap.put(null, "Saturay");<---TreeMap can not have null key
		treeMap.put(10, null);
		
		System.out.println(treeMap);
		
		
	}

}
