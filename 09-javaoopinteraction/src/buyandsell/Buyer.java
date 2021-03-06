package buyandsell;

public class Buyer {
//	구매자
//	구매자는 돈, 망고 갯수를 멤버 변수로 가집니다.(전역변수)
//	은닉 구현을 위해서 프라이빗으로 처리.
	private int mango;
	private int money;
	private int watermelon;
	
	
//	생성자는 (int money)를 받아 돈을 초기화
//	망고는 자동으로 0을 대입
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.watermelon = 0;
	}

//	BuyMango는 망고를 삽니다.
//	(int mango)망고 갯수를 입력받으면, 망고 *1000만큼의 
//	돈을 차감하고 망고 변수에 그만큼 갯수를 늘려준다.
	
//	현실에서 망고를 구매할 때 가게에서 구매자를 선택하지 않으므로
//	Seller변수를 Buyer가 고를 수 있도록 파라미터 설정을 합니다.
	public void buyWatermelon(Seller seller, int watermelon) {
		if(watermelon*1500>money) {
			System.out.println("금액이 부족하여 구매할 수 없음.");
			return;
		}
		if(seller.getWatermelon() < watermelon) {
			System.out.println("수박 재고가 부족합니다.");
			return;
		}
		seller.sellWatermelon(watermelon);
		this.money = money-(watermelon*1500);
		this.watermelon += watermelon;
	}
	
	public void buyMango(Seller seller, int mango) {
		//조건식 : 망고 가격보다 내 돈이 적은 경우.
		if(mango*1000>money) {
			System.out.println("금액이 부족하여 구매할 수 없음.");
			return;
		}
		//조건식 : 구매할 망고 갯수보다 판매자의 재고가 적은 경우.
		if(seller.getMango() < mango) {
			System.out.println("망고 재고가 부족합니다.");
			return;
		}
//		셀러쪽에서 망고를 파는 코드를 내가 망고를 사는 코드에 넣어서
//		동시에 사고 팔도록 처리해야 상호작용이 이뤄집니다.
		seller.sellMango(mango);
		this.money = money-(mango*1000);
		this.mango += mango;
	}

//	showBuyer는 구매자의 상태를 보여준다.
//	money, mango수치가 각각 몇인지 콘솔에 찍어준다.
	public void showBuyer() {
		System.out.println("소지 금액 :" + money);
		System.out.println("구입한 망고 갯수 :" + mango);
		System.out.println("구입한 수박 갯수:" + watermelon);
		System.out.println("-----------------------");
	}
}
