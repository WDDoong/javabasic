package inheritance.game;

public class Commoner {
//	레벨, 체력, 아이디, 마나수치를 변수로 만들어주세요.
	public int level;
	public int health;
	public String id;
	public int mana;
	public int exp;
	
//	메서드는 getInfo()로 콘솔에 변수 상태를 조회할 수 있도록
//	구성해주시면 됩니다.
	
	public void getInfo() {
		System.out.println("레벨은"+level+"입니다.");
		System.out.println("체력은 "+health+"입니다.");
		System.out.println("아이디는"+id+"입니다.");
		System.out.println("마나수치는"+mana+"입니다.");
		System.out.println("경험치는"+exp+"입니다.");
	}
	
}
