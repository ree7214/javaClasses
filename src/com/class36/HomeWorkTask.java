package com.class36;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HomeWorkTask {

	public static void main(String[] args) {
		//Create a map of Best Buy store. Place item id and 
		//item name into it. Example (7664847 = Printer, 7879885= TV etc )
		//Retrieve all keys and values from a Best Buy map using EntrySet.
		
		Map<Integer, String>Bestbuy = new HashMap<>();
		
		Bestbuy.put(987456, "Cameras");
		Bestbuy.put(456123, "Tablets");
		Bestbuy.put(123456, "Computers");
		Bestbuy.put(789654, "Printers");
		Bestbuy.put(314679, "TV");
		
		Set<Entry<Integer,String>> entryset=Bestbuy.entrySet();
		
		for(Entry<Integer,String>entry:entryset) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		System.out.println("----another way----");
		
		Iterator<Entry<Integer,String>>entryIt=entryset.iterator();
		while(entryIt.hasNext()){
		//	System.out.println(entryIt.next()); just prints all 
			Entry<Integer,String> keyIt=entryIt.next();
			Integer key=keyIt.getKey();
			String val=keyIt.getValue();
			System.out.println(key+"=="+val);
			
		}
	}

}
