package inheritance;

public class Main02 {
	
	public static void main(String[] args) {
		Salaryman sm1 = new Salaryman();
		sm1.name = "최이박";
		sm1.age = 30;
		sm1.salary = 8000;
		
		sm1.upSalary();
		sm1.getSalaryInfo();
		System.out.println("--------------");
		
		Student s1 = new Student();
		s1.name = "김나박";
		s1.age = 20;
		s1.major = "경영학과";

		s1.getStudentInfo();
		
	}

}
