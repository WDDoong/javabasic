package inheritance.game;

public class Main3 {
	
	public static void main(String[] args) {
		
		Magician m1 = new Magician();
		m1.id = "법사";
		m1.health = 10;
		m1.level = 20;
		m1.mana = 10;
		m1.mDam = 2;
		
		m1.getInfo();
		
		System.out.println("-------------------");
		
		Archer a1 = new Archer();
		a1.health = 10;
		a1.id = "궁수";
		a1.level = 5;
		a1.mana = 10;
		a1.rdam = 30;
		
		
		a1.getInfo();
	}

}
