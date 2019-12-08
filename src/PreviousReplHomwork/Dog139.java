package PreviousReplHomwork;
//Repl 139
public class Dog139 {

	public static void main(String[] args) {
		Dog139 Dog1=new Dog139("Tarzan", 50.0, dogBreed);
		Dog1.display();
		Dog139 Dog2=new Dog139("Tarzan", 50.0, dogBreed); 
		Dog2.display();	
			
	}
	
	String dogName;
	double dogWeight;
	static String dogBreed="Mutt";
	
	Dog139(String name, double weight, String breed){
		dogName=name;
		dogWeight=weight;
		dogBreed=breed;
		
	}
	void display() {
		System.out.println(dogName+" "+dogBreed+" "+dogWeight);
	}
	
}
