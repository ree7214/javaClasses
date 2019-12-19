package com.ReplHomewok;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Main202 {

	public static void main(String[] args) {

		LinkedHashMap<String, String>hmap = new LinkedHashMap<>();
		
		hmap.put("Street", "Patrick ST");
		hmap.put("Suite", "265");
		hmap.put("City", "Vienna");
		hmap.put("Zip", "22180");
		hmap.put("Country", "United State");
	
		Iterator<Entry<String, String>>hmapIt=hmap.entrySet().iterator();
		
		while(hmapIt.hasNext()) {
			System.out.println(hmapIt.next().getKey());
		}
		
	}

}
