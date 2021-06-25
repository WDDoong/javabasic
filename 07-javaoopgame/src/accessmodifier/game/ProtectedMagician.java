package accessmodifier.game;

public class ProtectedMagician extends ProtectedCommoner{
	public void hunt() {
		System.out.println("마법사 사냥시작");
		hp = hp-2;
		exp = exp+10;	
	}
	
	public void fireBall() {
		System.out.println("마법사 스킬 사용");
		mp = mp-2;
		exp = exp+15;
	}
	
	public void getAllData() {
		System.out.println("체력 :"+ hp);
		System.out.println("경험치 :"+ exp);
		System.out.println("마나 :"+ mp);
		System.out.println("레벨 :"+ level);
		System.out.println("------------------");
	}

}
