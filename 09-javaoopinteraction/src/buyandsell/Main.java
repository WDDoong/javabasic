package buyandsell;

public class Main {

	public static void main(String[] args) {
		
		Buyer b1 = new Buyer(10000);
		b1.showBuyer();
		b1.buyMango(seller, 2);
		b1.showBuyer();
		
		Seller s1 = new Seller(13, 1);
		s1.showSeller();
		s1.sellMango(100);
		s1.showSeller();

	}

}
