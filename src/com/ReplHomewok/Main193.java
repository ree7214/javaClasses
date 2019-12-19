package com.ReplHomewok;

import java.util.LinkedList;

public class Main193 {

	public static void main(String[] args) {
		
		LinkedList <Integer> llist = new LinkedList<>();
		
		llist.add(111);
		llist.add(222);
		llist.add(333);
		llist.add(444);
		llist.add(555);
		llist.add(666);
		
		int sum=0;
		for (int num:llist) {
		sum+=num;
		}
		
		System.out.println("Result of sum is "+sum);

	}

}
