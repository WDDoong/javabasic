package accessmodifier.game;

public class ProtectedCommoner {
	protected int level;
	protected int hp;
	protected int mp;
	protected int exp;
	
	public ProtectedCommoner() {
		this.hp = 20;
		this.mp = 10;
		this.level = 1;
		this.exp = 0;
		
		
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

}
