package accessmodifier;

public class Main {
	
	public static void main(String[] args) {
//		전사를 하나 만들고 사냥을 3번 하세요.
//		사냥 3번 후에 전체 상태를 sysout을 이용해 출력해주세요.
		Warrior w = new Warrior("백백");
		
		w.hunt();
		w.hunt();
		w.hunt();
		
//		System.out.println("체력 :"+w.hp);
//		System.out.println("공격력 :"+w.atk);
//		System.out.println("경험치 :"+w.exp);
//		System.out.println("아이디 :"+w.id);
//		System.out.println("레벨 :"+w.level);
		System.out.println("------------");
		Warrior w2 = new Warrior("이백");
		w2.hunt();
		w2.hunt();
		w2.hunt();
		w2.hunt();
	}

}
