package PreviousReplHomwork;

class StoreProduct {

	String label;
	double price;
	String category;
	boolean hasExpiration;
	int stock;

	public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {

		this.label = label;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
		this.stock = stock;

		System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	}

	public StoreProduct(String label, double price, int stock) {

		System.out.println(label + " " + price + " " + stock);

	}

	public StoreProduct(String label, double price) {

		System.out.println(label + " " + price);
	}
}

public class Main141 {

	public static void main(String[] args) {

		StoreProduct obj1 = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
		StoreProduct obj2 = new StoreProduct("Paper Towels", 2.0, "misc", false, 24);
		StoreProduct obj3 = new StoreProduct("Paper Towels", 2.0, null, false, 0);

	}

}