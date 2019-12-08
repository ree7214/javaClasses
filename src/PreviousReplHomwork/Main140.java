package PreviousReplHomwork;

/*
 * Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
 */
 class Car{
	 String make;
		String model;
		int numberOfDoors=4;
		int topSpeed;
		double price;
		
	public	Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
			this.make=make;
			this.model=model;
			this.numberOfDoors=numberOfDoors;
			this.topSpeed=topSpeed;
			this.price=price;
			
			System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
			
		}
	public	Car(String make, String model, int topSpeed, double price){//Toyota Prius 4 120 30000.0
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
		}
	public	Car(int topSpeed, double price){//unknown unknown 4 120 30000.0
		
		System.out.println("unknown"+" "+"unknown"+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
			}
	public Car(String make, String model, int numberOfDoors) {
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
		
}

public class Main140 {

	public static void main(String[] args) {
		Car obj = new Car("Toyota", "Prius", 4, 120, 30000.0);
		Car obj1 = new Car("Toyota", "Prius", 120, 30000.0);
		Car obj2 = new Car(120,30000.0);
		Car obj3 = new Car("Toyota","Prius", 90, 0.0);

	}

}
