package interaction.game;

public class Zombi {
	private int hp;
	private int defense;
	private int atk;
	
	public Zombi() {
		this.atk = 15;
		this.defense = 0;
		this.hp = 50;
	}
	
	public void doBattle(int userAtk) {
		this.hp = (this.hp + this.defense) - userAtk;
		if(this.hp <= 0)
			System.out.println("이 좀비는 이미 죽었습니다.");
	}
	
	public int getHp() {
		return this.hp;
	}
	public int getAtk() {
		return this.atk;
	}
	

}
