package polymorphism;

public class Main {
	
	public static void main(String[] args) {
//		부모타입인 Person만으로도 양쪽 자료형을 모두 처리 가능.
		Person s1 = new Student("학생", 10, 3);
		Person p1 = new Painter("화가", 50, 6);
		Person a1 = new Actor("배우", 60, 20);
//		단, 메서드는 Person을
//		베이스 객체는 Person에 정의된 메서드만 호출가능
		s1.showPerson();
//		s1.showStudent();
		p1.showPerson();
//		p1.showPainter();
		a1.showPerson();
	}

}
