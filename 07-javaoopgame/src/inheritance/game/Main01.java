package inheritance.game;

public class Main01 {

	public static void main(String[] args) {
		//	초보자 계정 하나를 생성하고 확인해주세요.
		Commoner c1 = new Commoner();
		c1.level = 10;
		c1.health = 20;
		c1.id = "초보자1";
		c1.mana = 30;
		
		c1.getInfo();

	}

}
