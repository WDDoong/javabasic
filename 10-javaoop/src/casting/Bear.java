package casting;

public class Bear extends Animal{

	public Bear (String name, int age) {
	super(name, age);
	}
	
	public void hunting() {
		System.out.println("곰이 사냥을 합니다.");
	}
	
	public void sleepAnimal() {
		System.out.println("곰이 잠을 잡니다.");
	}
}