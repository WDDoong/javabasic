package buyandsell;

public class Main2 {

	public static void main(String[] args) {
		//상인 2개 만들기
		Seller seller1 = new Seller(100, 5);
		Seller seller2 = new Seller(50, 3);
		
		//구매자 1개 만들기
		Buyer buyer = new Buyer(5000);
		//구매자 정보 확인
		buyer.showBuyer();
		//1번 상인 정보 확인
		seller1.showSeller();
		//2번 상인 정보 확인
		seller2.showSeller();
		//1번 상인에게 구매자가 망고 구매
		buyer.buyMango(seller1, 10);
		buyer.buyWatermelon(seller2, 2);
		//구매자 정보 확인
		buyer.showBuyer();
		//1번 상인 정보 확인
		seller1.showSeller();
		//2번 상인 정보 확인
		seller2.showSeller();
		
//		★상호작용의 문제점
//		상인이 많아지면 메서드 갯수도 상인 수 만큼 늘어나야 함.
		
		

	}

}
