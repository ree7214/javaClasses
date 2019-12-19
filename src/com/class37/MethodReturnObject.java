package com.class37;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MethodReturnObject {

	public static void main(String[] args) {
		
		List<String>list=returnStringList("Java", "My favorite subject");
		System.out.println(list);
		
		
	}
	
	// create a method that will return an object of Scanner class
	
	public static Scanner returnScanner() {
		
		Scanner scan=new Scanner (System.in);
		
		return scan;
	}
	// create a method that will return an object of List class
	
	public static List returnStringList(String str, String str1) {
		
		List<String>list = new ArrayList<>();
		list.add(str);
		list.add(str1);
		
		return list;
	}
	// create a method that will return an object of Map class
	
	public static Map returnMap(String key, String value, String key1, String value1) {
		Map<String, String> map=new HashMap<>();
		map.put(key, value);
		map.put(key1, value1);
		
		return map;
	}
	
	

}
