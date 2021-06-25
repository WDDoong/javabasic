package structure;

public class Structure02 {
	
	//person 내부의 정보를 쉽게 조회하기 위한 매서드 제작
	
	public static void getInfo(Person p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
	}	
	
	public static void getCatInfo(Cat c) {
		System.out.println("고양이 이름" + c.name);
		System.out.println("고양이 나이" + c.age);
		System.out.println("고양이 품종" + c.type);
		
	}
	public static void main(String[] args) {	
		Person e = new Person();
		e.name = "이박최";
		e.age = 10;
		e.pNum = "010-123-4567";
		e.address = "서울";
		
		
		
		Cat a = new Cat();
		a.name = "나비";
		a.age = 1;
		a.type = "스코티쉬";

		
		Cat b = new Cat();
		b.name = "김이박";
		b.age = 20;
		b.type = "터키쉬";
		
		getCatInfo(a);
		getCatInfo(b);
		
	}

}
