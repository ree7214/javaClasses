package com.class36;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
/*
 * Create a Map from array of cities that will sort keys in alphabetical order. 
 * As a key store the name of the city and as a value store the 
 * length of the city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). 
 * If any city name is more than 7 characters remove that city ( use Iterator ). 
 * 
 */
public class Task1 {

	public static void main(String[] args) {
		
		String[]city= {"Paris","Moscow","Washington DC","Trenton","Manhatan"};
		Map<String,Integer> cityMap=new TreeMap<>();
		
		System.out.println(cityMap.size());
		
		for(String c:city) {
			cityMap.put(c, c.length());
		}
		System.out.println(cityMap);
		Iterator<Entry<String,Integer>>CityIt=cityMap.entrySet().iterator();
		while(CityIt.hasNext()) {
			String key=CityIt.next().getKey();
			if(key.length()>7) {
				CityIt.remove();
			}
			System.out.println(cityMap);
		}
	}
	

}
