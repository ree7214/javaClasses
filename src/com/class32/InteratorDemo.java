package com.class32;

import java.util.ArrayList;
import java.util.Iterator;


public class InteratorDemo {

	public static void main(String[] args) {
		ArrayList<String>strList=new ArrayList<>();
		strList.add("Daniel");
		strList.add("Matt");
		strList.add("Maria");
		strList.add("Mike");
		
		//retrieve values from an ArrayList
		// 1st way using for loop
		
		for (int i=0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		//2nd way using enhaned for loop
		for(String name:strList) {
			System.out.println(name);
		}
		//3rd way using Iterator
		Iterator<String>it=strList.iterator();
	}

}
