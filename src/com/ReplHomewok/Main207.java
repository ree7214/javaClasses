package com.ReplHomewok;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Main207 {

	public static void main(String[] args) {
		
		HashMap<String, String>map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");
		
		Iterator<Entry<String, String>>itMap=map.entrySet().iterator();
	
		while(itMap.hasNext()) {}
		//System.out.println(itMap.next().getKey()+":"+itMap.next().getValue());
		System.out.println(itMap.next());
	}

}
//need help