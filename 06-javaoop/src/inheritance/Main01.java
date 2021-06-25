package inheritance;

public class Main01 {
	
	public static void main(String[] args) {
//		Student가 Person 을 상속했기 때문에
//		Student는 Person의 자원을 사용할 수 있습니다.
		Student s1 = new Student();
		s1.name = "김이박";
		s1.age = 20;
		s1.major = "컴퓨터 공학";
		
		s1.getPersonInfo();
		System.out.println("---------------");
		s1.getStudentInfo();
	}

}
