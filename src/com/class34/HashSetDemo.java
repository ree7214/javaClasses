package com.class34;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// create a collection of veggies where I do not want to have duplicates
		// hset order of the elements is not presered
		HashSet<String>hset=new HashSet<>();
		
		//storing value into hashset
		hset.add("cucumber");
		hset.add("onion");
		hset.add("pepper");
		hset.add("zuccini");
		hset.add("carrot");
		hset.add("zuccini");
		
		//does not show duplicats
		System.out.println(hset.size());
		System.out.println(hset);
		
		//they do not have any methods to retrieve any elements from the collection
		//.get();, .set();
		
		// how can we retrieve all elements?
		
		//using iterator
		Iterator<String>it=hset.iterator();
		while(it.hasNext()) {
			String element=it.next();
			System.out.println(element);
			
		}
		
		System.out.println("------another way using enhanced loop-------");
		//enhanced for loop
		
		for(String el:hset) {
			System.out.println(el);
		}
	}

}
