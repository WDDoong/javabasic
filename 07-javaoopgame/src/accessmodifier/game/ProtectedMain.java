package accessmodifier.game;

public class ProtectedMain{

	public static void main(String[] args) {
		
		ProtectedWarrior w1 = new ProtectedWarrior();
		System.out.println("<전사>");
		w1.getWarriorStatus();
		w1.doubleAttack();
		w1.getWarriorStatus();
		w1.hunt();
		w1.getWarriorStatus();
		
		ProtectedArcher a1 = new ProtectedArcher();
		System.out.println("<궁수>");
		a1.getAllData();
		a1.multiShot();
		a1.getAllData();
		a1.hunt();
		a1.getAllData();
		
		ProtectedMagician m1 = new ProtectedMagician();
		System.out.println("<마법사>");
		m1.getAllData();
		m1.fireBall();
		m1.getAllData();
		m1.hunt();
		m1.getAllData();
	}

}
