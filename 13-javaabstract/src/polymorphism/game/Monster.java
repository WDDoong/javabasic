package polymorphism.game;


/**
 * 1. 개요
 * 	- 필드 몬스터 정보
 * @author wd91
 */
public abstract class Monster {
	/** 몬스터 명 */
	private String name;
	/** 체력 */
	private int hp;
	/** 방어력 */
	private int def;
	/** 공격력 */
	private int atk;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}

	/**
	 * 1. 개요
	 * 	- 몬스터 생성
	 * 	1) 몬스터는 생성시 값을 보유 하고 있어야 함.
	 * 		- null 속성 몬스터 제외
	 */
	public Monster(
			String name, 
			int hp, 
			int def, 
			int atk) {
		this.name = name;
		this.hp = hp;
		this.def = def;
		this.atk = atk;
	}
	/**추상 메서드*/
	public abstract void doBattle(int uAtk);// {
//		this.hp = (this.hp + this.def) - uAtk;
//		if(this.hp <= 0) {
//			System.out.println(this.name+"는(은) 죽었습니다.");
//		}
//	}

	public void showStatus() {
		System.out.println("<<"+ this.name +"의 상태입니다.>>");
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
	}
	
	
}
