package com.class29;

public abstract class File {
	public abstract void open();
	
	public void edit() {
		System.out.println("We can edit a file.");
	}
	public void close() {
		System.out.println("We can close a file.");
	}
	
		
	}
class JavaFile extends File{

	@Override
	public void open() {
		System.out.println("To open .java we need notepad++");
		
	}
	
}

class WordFile extends File{

	@Override
	public void open() {
		System.out.println("To open .do we need sublime textt");
		
	}
	
}
class PDFFile extends File{

	@Override
	public void open() {
		System.out.println("To open PDF fIle we need to install Microsoft word");
		
	}
	
}