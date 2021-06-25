package accessmodifier.game;

public class Warrior extends Commoner {

	public void hunt () {
		System.out.println("전사 사냥 시작");
		//hp = hp-2;
		setHp(getHp()-2);
		setExp(getExp()+10);
	}
	
	public void doubleAttack() {
		System.out.println("전사 스킬 사용");
		setMp(getMp()-2);
		setExp(getExp()+15);
	}
	public void getAllData() {
		System.out.println("레벨 : " + getLevel());
		System.out.println("경험치 : " + getExp());
		System.out.println("체력 : " + getHp());
		System.out.println("마나 : " + getMp());
		System.out.println("---------------");
	}


}
	