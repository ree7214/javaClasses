package com.class34;

import java.util.LinkedList;

public class LinkedListExample2 {

	public static void main(String[] args) {
		//Linked List Declaration
		LinkedList<String>linkedlist= new LinkedList<>();
		
		linkedlist.add("Craig");
		linkedlist.add("Ava");
		linkedlist.add("Oliver");
		linkedlist.add("Campbells");
		linkedlist.add("Colty");
		
		//Displaying Link List Content
		System.out.println("Linked list Content "+linkedlist);
		
		//add first and last element
		linkedlist.addFirst("Jaws");
		linkedlist.add("Zeus");
		System.out.println("LinkedList after adding 1st and last element "+linkedlist);
		
		//Get and set values
		Object name1=linkedlist.get(0);
		System.out.println("First element: "+name1);
		

	}

}
