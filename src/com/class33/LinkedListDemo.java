package com.class33;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//create Linked list of String Object
		LinkedList<String>llist=new LinkedList<>();
		llist.add("Hello");
		llist.add("Bye");
		llist.add("good bye");
		
		System.out.println(llist.getFirst());

		for(String l1:llist) {
			System.out.println(l1);
		}
		
		System.out.println(llist.size());
		llist.add("Hello1");
		llist.add("Bye1");
		//retrieve
		System.out.println(llist.get(1));
		//update/replace
		llist.set(2, "Hi");
		System.out.println(llist);
	
		

	}

}
