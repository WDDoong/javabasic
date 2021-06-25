package inheritance.game;

public class Magician extends Commoner{
	//마법데미지
	public int mDam;
	
	public void getInfo() {
		System.out.println("마법 공격력 :"+ mDam);
		System.out.println("아이디 :" + id);
		System.out.println("체력 :" + health);
		System.out.println("마나 :" + mana);
		System.out.println("레벨 :" + level);
	}
	

}
