package polymorphism.game;

public class Orc extends Monster{

	private int hp;

	public Orc() {
		super("오크", 20, 1, 3);
		
	public void doBattle(int uAtk) {
		this.hp = (this.getHp() + this.getDef()) - uAtk;
		if(this.getHp() <= 0) {
			System.out.println(this.getName()+"는(은) 죽었습니다.");
		}
	}
	}

}
