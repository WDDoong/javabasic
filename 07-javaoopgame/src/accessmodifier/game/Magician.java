package accessmodifier.game;

public class Magician extends Commoner{
	public void hunt() {
		System.out.println("마법사 사냥시작");
		setHp(getHp()-2);
		setExp(getExp()+10);
	}
	public void fireBall() {
		System.out.println("마법사 화력 스킬");
		System.out.println("++++++++++");
		setMp(getMp()-2);
		setExp(getExp()+15);
	}
	public void freezing() {
		System.out.println("마법사 얼음 스킬");
		setMp(getMp()-1);
		setExp(getExp()+5);
	}
	public void getAllData() {
		
		System.out.println("레벨 :" + getLevel());
		System.out.println("경험치 :" + getExp());
		System.out.println("체력:" + getHp());
		System.out.println("마나 :" + getMp());
		System.out.println("----------------");
		}
		
	}


