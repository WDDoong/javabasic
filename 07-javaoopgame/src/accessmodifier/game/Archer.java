package accessmodifier.game;


public class Archer extends Commoner {
	public void hunt() {
		System.out.println("궁수 사냥시작");
		setHp(getHp()-2);
		setExp(getExp()+10);
	}
	public void multiShot() {
		System.out.println("궁수 스킬 사용");
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
