package com.class24;

public class Shopping {
	
	public String store, department;
	
 Shopping(String storeName, String storeDept){
		store=storeName;
		department=storeDept;
 }	
		public void displayStore() {
			System.out.println("Today I went shopping at "+store+" and bought something from the "+department+" department");
		}
		
	
	public static void main(String[] args) {
		Shopping shop1=new Shopping("Macy","womens");
		shop1.displayStore();
		
		Shopping shop2=new Shopping("Kohls","childrens");
		shop2.displayStore();
	}

}
