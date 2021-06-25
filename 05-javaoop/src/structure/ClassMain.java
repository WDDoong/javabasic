package structure;

public class ClassMain {
	
	public static void main(String[] args) {
		
		PersonClass person1 = new PersonClass();
		PersonClass person2 = new PersonClass();
		
		person1.name = "김";
		person1.age = 10;
		person1.pNum = "010-2345-6789";
		person1.address = "경기";
		person1.glasses = true;
		
		person2.name ="이";
		person2.age = 20;
		person2.pNum = "010-3456-1234";
		person2.address = "대구";
		person2.glasses = false;
		
		person1.getInfo(person1);
		person2.getInfo(person2);
	}

}
