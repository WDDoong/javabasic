package accessmodifier.game;

public class Commoner {
	private int level;
	private int hp;
	private int mp;
	private int exp;
	
	public Commoner() {
		this.level = 1;
		this.exp = 0;
		this.hp = 20;
		this.mp = 10;
	}
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public void AllData() {
		System.out.println("레벨 : " + level);
		System.out.println("경험치 : " + exp);
		System.out.println("체력 : " + hp);
		System.out.println("마나 : " + mp);
		System.out.println("---------------");
	}
	
}
