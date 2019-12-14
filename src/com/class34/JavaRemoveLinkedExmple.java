package com.class34;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaRemoveLinkedExmple {

	public static void main(String[] args) {
	      LinkedList<String> list=new LinkedList<String>();

	      //Adding elements to the Linked list
	      list.add("Amanda");
	      list.add("Daniel");
	      list.add("Mathew");
	      list.add("Mike");
	      list.add("Maria");
	      list.add("Anna");

	      //Removing First element
	      list.removeFirst();

	      //Removing Last element
	      list.removeLast();

	      //Iterating LinkedList
	      Iterator<String> iterator=list.iterator();
	      while(iterator.hasNext()){
	         System.out.print(iterator.next()+" ");
	      }

	      //removing 2nd element, index starts with 0
	      list.remove(1);

	      System.out.print("\nAfter removing second element: ");
	      //Iterating LinkedList again
	      Iterator<String> iterator2=list.iterator();
	      while(iterator2.hasNext()){
	         System.out.print(iterator2.next()+" ");
	      }
	   }
	}
