package inheritance;

//	상속문법
//	클래스 명칭 오른쪽에 <extends 부모클래스 이름>을 적습니다.
//	이렇게 상속을 한 클래스는 부모, 자식 클래스가 하나의 객체 내부에
//	공존하는 형태로 메모리에 생성됩니다.

public class Salaryman extends Person {//Person쪽 정보를 다 가져오겠다. 
	
	// 연봉을 추가로 가져갑니다.
	public int salary;
	
	public void upSalary() {
		salary += 1000;
	}
	
	public void getSalaryInfo() {
		//상속시 부모쪽의 자원을 마음대로 사용할 수 있습니다.
		getPersonInfo();//Person쪽 정보인 name, age를 가져와서 쓸 수 있다.
		System.out.println("연봉은" + salary + "만원입니다.");
	}

}
