package PreviousReplHomwork;

public class Main144 {

	String model;
	double price;
	double quantity;
	double stockvalue;

	public Main144(String model, double price, double quantity) {
		this.model = model;
		this.price = price;
		this.quantity = quantity;
		this.stockvalue = stockvalue;
		double st = price * quantity;
		// System.out.println(model + " " + "Stock Value " + st);
	}

	public void carStockValue(String model, double price, double quantity) {
		double st = price * quantity;
		System.out.println(model + "  " + "Stock Value " + st);
	}
	public static void main(String[] args) {
		Main144 toyotaCar = new Main144("Toyota 2019", 25000, 100);
		toyotaCar.carStockValue("Toyota 2019", 25000, 100);
		Main144 bmw = new Main144("BMW 2019", 65298, 100);
		bmw.carStockValue("BMW 2019", 65298, 10);
	}

}
