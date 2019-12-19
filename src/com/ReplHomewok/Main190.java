package com.ReplHomewok;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main190 {
	static ArrayList<Integer> listB = new ArrayList<>();

	public static void main(String[] args) {

		ArrayList<Integer> listA = new ArrayList<>();

		listA.add(0);
		listA.add(1);
		listA.add(2);
		listA.add(3);
		listA.add(4);
		listA.add(5);
		//listB.addAll(listA);
	//	listB.addAll(listA);
		for (int i = 0; i < 6; i++) {
			listB.add(i);
			listB.add(i);
		}
		System.out.println(listB);

	}
	
}
