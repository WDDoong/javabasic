package polymorphism.game;

public class Monster{
	private String name;
	private int hp;
	private int atk;
	private int defense;
	
	public Monster(String name, int hp, int atk, int defense) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.defense = defense;
	}
	
	public void showMonster() {
		System.out.println("몬스터 이름 :" + name);
		System.out.println("체력 :" + hp);
		System.out.println("공격력 :" + atk);
		System.out.println("방어력 :" + defense);
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

		
	}
	
	
	

	
	


