package com.class29;

public class FileTest {

	public static void main(String[] args) {
		File file = new JavaFile();
		file.open();
		file.edit();
		file.close();
		
		System.out.println("****************************");
		
		File file1 = new WordFile();
		file1.open();
		file1.edit();
		file1.close();
		
		System.out.println("****************************");
		
		File file2 = new PDFFile();
		file2.open();
		file2.edit();
		file2.close();

	}

}
