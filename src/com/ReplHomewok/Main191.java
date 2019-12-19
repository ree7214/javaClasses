package com.ReplHomewok;

import java.util.ArrayList;

public class Main191 {
	 static ArrayList<Boolean> listB = new ArrayList<>();
	public static void main(String[] args) {

			ArrayList<Boolean> listA = new ArrayList<>();
			listA.add(true);
			listA.add(false);
			listA.add(false);
			
			for(int i=0; i<listA.size()-1;i++) {
				listB.addAll(i, listA);
			}
			System.out.println(listB);
	}

}
