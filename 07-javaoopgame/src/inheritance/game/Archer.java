package inheritance.game;

public class Archer extends Commoner {
	//원거리공격
	public int rdam;
	
	public void getInfo() {
		System.out.println("원거리 공격력 :" + rdam);
		System.out.println("아이디 :" + id);
		System.out.println("체력 :" + health);
		System.out.println("마나 :" + mana);
		System.out.println("레벨 :" + level);
	}
}
