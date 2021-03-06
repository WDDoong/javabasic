package buyandsell;

public class Seller{
//	판매자
//	돈, 망고를 가집니다.
	private int mango;
	private int money;
	private int watermelon;
	
//	생성자에서 망고갯수를 입력받을 수 있습니다.
//	돈은 0으로 넣어주세요.
	public Seller(int mango, int watermelon) {
		this.money = 0;
		this.mango = mango;
		this.watermelon = watermelon;
	}
	
//	판매시 망고갯수를 입력할 수 있고
//	망고갯수 * 1000만큼의 돈이 올라가고
//	망고는 판 갯수만큼 차감 됩니다.
//	0미만으로 망고가 줄어들 수 없습니다.
	public void sellWatermelon(int watermelon) {
		if(watermelon>this.watermelon) {
			System.out.println("수박 재고가 부족하여 판매할 수 없음.");
			return;
		}
			this.money += watermelon*1500;
			this.watermelon -= watermelon;
	}
	public void sellMango(int mango) {
		if(mango>this.mango) {
		System.out.println("망고 갯수가 부족하여 판매할 수 없음.");
		return;
	}
		this.money += mango*1000;
		this.mango -= mango;
	}
	
//	showSeller를 이용해 현재 남은 망고와 돈을 볼 수 있습니다.
	public void showSeller() {
		System.out.println("현재까지 판매 금액 : " + money);
		System.out.println("망고 재고 : " + mango);
		System.out.println("수박 재고 : " + watermelon);
		System.out.println("-----------------------");
	}
	
//	망고 갯수를 buyer에서 확인 할 수 있도록
//	getMango()getter를 생성해줌.
	public int getMango() {
		return mango;
	}
	public int getWatermelon() {
		return watermelon;
	}
	

}//상호작용 힌트: Buyer의 buyMango메소드의 파라미터에 seller를 줘서 Buyer내부에서 Seller까지 같이 컨트롤합니다.
