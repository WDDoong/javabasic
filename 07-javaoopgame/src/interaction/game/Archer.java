package interaction.game;

public class Archer {
	private int hp;
	private int mp;
	private int exp;
	private int level;
	private int atk;
	private int defense;
	
	public Archer() {
		this.level = 1;
		this.exp = 30;
		this.atk = 45;
		this.defense = 30;
		this.hp = 100;
		this.mp = 50;
	}
	
	public void huntOrc(Orc orc) {
		if(orc.getHp() <= 0) {
			System.out.println("이미 죽은 오크는 공격할 수 없습니다.");
			return;
		}
		orc.doBattle(this.atk);
		if(orc.getAtk() > (this.hp+this.defense)){
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(orc.getHp() <= 0) {
			System.out.println("경험치를 20 획득했습니다.");
			this.exp += 20;
			System.out.println("오크와의 교전 완료.");
			return;
		}
		
		this.hp = (this.defense + this.hp) - orc.getAtk();
		System.out.println("오크와의 교전 완료!");
	}
	
	public void huntZombi(Zombi zom) {
		if(zom.getHp() <= 0) {
			System.out.println("이미 죽은 좀비 입니다.");
			return;
		}
		zom.doBattle(this.atk);
		if(zom.getAtk() > (this.atk + this.defense)) {
			System.out.println("유저가 사망했습니다.");
			return;
		}
		if(zom.getHp() <= 0) {
			System.out.println("경험치를 20p 획득했습니다.");
			this.exp += 20;
			System.out.println("좀비와의 교전 완료!");
			return;
		}
		this.hp = (this.defense + this.hp) - zom.getAtk();
		System.out.println("좀비와의 교전완료!");
	}

	
	public void ArcherStatus() {
		System.out.println("체력 ;" + hp);
		System.out.println("마나 ;" + mp);
		System.out.println("경험치 ;" + exp);
		System.out.println("레벨 ;" + level);
		System.out.println("공격력 ;" + atk);
		System.out.println("방어력 ;" + defense);
		System.out.println("-----------------");
	}
	

}
