package PreviousReplHomwork;

public class Main145 {
	String item;
	double price;
	int quantity;
	Main145(String item, double price, int quantity){
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}
	double itemPurchased() {
		double Total = quantity*price;
		System.out.println(item+" Total Value "+Total);
		return Total;
	}
	public static void main(String[] args) {
		Main145 Blancket = new Main145 ("Blancket",49.99,2);
		double BlanTotal = Blancket.itemPurchased();
		Main145 Mattress = new Main145("Mattress",219.59,2);
		double MatTotal = Mattress.itemPurchased();
		double sum = BlanTotal+MatTotal;
		System.out.println("You purchased "+sum+" Today");
	}
	}