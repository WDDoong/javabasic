package interaction.game;

public class Orc {
	private int hp;
	private int atk;
	private int defense;
	
	public Orc() {
		this.hp = 50;
		this.atk = 30;
		this.defense = 20;
	}
	
	public void doBattle(int userAtk) {
		this.hp = (this.hp + this.defense) - userAtk;
		if(this.hp <=0) {
			System.out.println("이 오크는 이미 죽었습니다.");
		}
	}
	public int getHp() {
		return this.hp;
	}
	public int getAtk() {
		return this.atk;
	}
	
	

}
