package com.ReplHomewok;

import java.util.ArrayList;

public class Main185 {

	public static void main(String[] args) {
		 ArrayList<Integer>list=new ArrayList<>();
		list.add(111);
		list.add(222);
		list.add(333);
		list.add(444);
		list.add(555);
		list.add(666);
		
		System.out.println(list);
		
	for ( int i:list) {
		System.out.println(i);
	}
	list.clear();
	System.out.println(list);

	}

}
