package casting;

public class Main {

	public static void main(String[] args) {
//		Animal타입은 어떤 자료형이건 받을 수 있다.
		Animal b1 = new Bear("곰", 2);//근본이 곰
		Animal t1 = new Turtle("거북", 20);//근본이 거북이
		Animal a1 = new Animal("동물", 9);//근본이 애니멀
		
		b1.sleepAnimal();
		t1.sleepAnimal();
		a1.sleepAnimal();
		
//		자식타입을 베이스로 만든 부모타입 변수는
//		자식타입으로 강제로 바꿀 수 있다.
		Bear bear = (Bear)b1;
//		원타입으로 돌려놓으면 원타입만의 메소드도 호출이 가능합니다.
		bear.hunting();
		
		Turtle turtle = (Turtle)t1;
		turtle.eat();
		
//		근본이 Animal인 경우는 다른 타입으로 변형이 안됩니다.
		Bear bear2 = (Bear)a1;
		bear2.hunting();
		
	}

}
