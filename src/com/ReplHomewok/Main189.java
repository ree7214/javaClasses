package com.ReplHomewok;

import java.util.ArrayList;

public class Main189 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
			
		list.add("hi");
		list.add("yo");
		list.add("sup");
		list.add("yolo");
		list.add("boop");
		
		list.remove("hi");
		list.remove("sup");
		list.remove("boop");
		System.out.print(list.get(0)+" "+list.get(1));
		
	}

}
