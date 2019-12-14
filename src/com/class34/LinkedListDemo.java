package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String>llist=new LinkedList<>();
		//adding elements
		llist.add("Hello");
		llist.add("Bye");
		llist.add("Hello1");
		llist.add("Bye2");
		llist.add(2,"How are you");
		
		System.out.println(llist);
		
		//replace an element
		llist.set(1, "Good bye");
		System.out.println(llist);
		
		//retrieve an element
		String element=llist.get(2);
		System.out.println(element);
		
		System.out.println("---------first way--------------");
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
			
		}
		System.out.println("---------Second way------------");
		System.out.println();
		for(String el:llist) {
			System.out.println(el);
		}
		System.out.println("---------Third way-----------");
				 Iterator<String> iterator=llist.iterator();
	      while(iterator.hasNext()){
	         System.out.println(iterator.next()+" ");
	      }

	}

}
