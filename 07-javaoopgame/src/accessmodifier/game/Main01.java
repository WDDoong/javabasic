package accessmodifier.game;


public class Main01 {
	
	public static void main(String[] args) {
		
		Commoner c1 = new Commoner();
		c1.AllData();
		
		Warrior w1 = new Warrior();
		System.out.println("<전사>");
		w1.getAllData();
		w1.doubleAttack();
		w1.getAllData();
		w1.hunt();
		w1.getAllData();
		
		
		Archer a1 = new Archer();
		System.out.println("<궁수>");
		a1.getAllData();
		a1.hunt();
		a1.getAllData();
		a1.multiShot();
		a1.getAllData();
		
		
		Magician m1 = new Magician();
		System.out.println("<마법사>");
		m1.getAllData();
		m1.fireBall();
		m1.getAllData();
		m1.freezing();
		m1.getAllData();
		m1.hunt();
		m1.getAllData();

	}
}

