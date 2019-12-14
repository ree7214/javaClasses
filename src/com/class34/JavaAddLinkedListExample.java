package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaAddLinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String>list=new LinkedList<>();
		
		//adding elements to the linked list
		list.add("Maria");
		list.add("Daniel");
		list.add("Matthew");
		
		//adding an element to the first position
		list.addFirst("Mike");
		
		//adding element to the last position
		list.addLast("Amanda");
		
		//adding an element to the third posiion
		list.add(2, "Anna");
		
		//Iterating LinkedList
		Iterator<String>iterator=list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		

}
}