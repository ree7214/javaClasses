package PreviousReplHomwork;

public class Main_107 {
	
	String breed, name, color;
	
	void bark() {
		System.out.println(breed+" can bark");
	}
	void run() {
		System.out.println(breed+" can run");
	}
	void play(){
		System.out.println(breed+" can play");
	} 
	
		public static void main(String[] args) { 
	Main_107 Husky=new Main_107();
	Husky.breed="Husky";
	
	Husky.bark();
	Husky.run();
	Husky.play();
	
	Main_107 Bulldog=new Main_107();
	Bulldog.breed="Bulldog";
	
	Bulldog.bark();
	Bulldog.run();
	Bulldog.play();
	
	Main_107 Labrador=new Main_107();
	Labrador.breed="Labrador";
	
	Labrador.bark();
	Labrador.run();
	Labrador.play();
	
	System.out.println();
	}
}
