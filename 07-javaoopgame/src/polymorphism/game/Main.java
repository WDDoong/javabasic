package polymorphism.game;

public class Main {

	public static void main(String[] args) {
		
		Monster orc = new Orc();
		Monster troll = new Troll();
		Knight knight = new Knight();
		Warrior w1 = new Warrior();
		
		orc.showStatus();
		troll.showStatus();
		knight.showStatus();
		
		knight.hunt(troll);
		knight.hunt(troll);
		knight.hunt(troll);
		knight.hunt(troll);
		knight.hunt(troll);
		knight.doubleAttack(troll);
		troll.showStatus();
		
		knight = new Knight();
		knight.hunt(orc);
		knight.hunt(orc);
		knight.hunt(orc);
		knight.hunt(orc);
		knight.doubleAttack(orc);
		orc.showStatus();
		
	}
}
