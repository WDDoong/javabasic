package casting;

public class MainInstanceof {
	
	public static void main(String[] args) {
		Animal b1 = new Bear("곰", 2);
//		현재 Animal 타입인 b1의 근본자료형이 Bear인지 검사
		System.out.println(b1 instanceof Bear);
//		현재 Animal 타입인 b1의 근본자료형이 Turtle인지 검사
		System.out.println(b1 instanceof Turtle);
//		현재 Animal 타입인 b1의 근본자료형이 Animal인지 검사
		System.out.println(b1 instanceof Animal);
	}

}
