package com.class35;

import java.util.*;
import java.util.Map.Entry;

public class RetrieveAll {

	public static void main(String[] args) {
		
      //create a map of a classroom in which we will store objects and its quantity

		Map<String, Integer> classRoom = new HashMap<>();
		classRoom.put("Instructor", 3);
		classRoom.put("Students", 80);
		classRoom.put("Tables", 20);
		classRoom.put("Chairs", 80);

		System.out.println(classRoom);

		Set<Entry<String, Integer>> entrySet = classRoom.entrySet();

		System.out.println("----using for each loop to get all entry objects----");

		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println("----using Iterat0r to get all entry objects----");
		
		Iterator<Entry<String, Integer>>entryIterator=entrySet.iterator();
		while(entryIterator.hasNext()) {
			
			Entry<String,Integer>ent=entryIterator.next();
			String entry1=ent.getKey()+"----"+ent.getValue();
			System.out.println(entry1);
			
			
		}

	}

}
