package polymorphism;

public class Painter extends Person{
	private int masterpiece;
	
	public Painter(String name, int age, int masterpiece) {
		super(name, age);
		this.masterpiece = masterpiece;
	}
	public void showPainter() {
		super.showPerson();
		System.out.println("명작 갯수 :" + masterpiece);
		System.out.println("------------------");
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("명작 수 :" + masterpiece);
		System.out.println("--------------");
	}
}
