package casting;

public class Turtle extends Animal{
	
	public Turtle (String name, int age) {
	super(name, age);
	}
	
	public void eat() {
		System.out.println("거북이가 먹이를 먹습니다.");
	}
	
	public void sleepAnimal() {
		System.out.println("거북이가 잠을 잡니다.");
	}
}
