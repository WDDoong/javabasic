package polymorphism;

public class Actor extends Person{

	private int movie;
	
	public Actor(String name, int age, int movie) {
		super(name, age);
		this.movie = movie;
	}
	public void showPerson() {
		super.showPerson();
		System.out.println("μΆμ°μ μ :" + movie);
		System.out.println("----------------");
	}
	

	
	
	

}
