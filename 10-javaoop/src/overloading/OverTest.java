package overloading;

public class OverTest {
	private String a;
	private int b;
	
//	main메서드가 없는 자바 클래스 파일에는
//	static을 붙이지 않습니다.
//	생성자 문법
//	메서드처럼 작성하지만, 리턴 자료형을 기입하지 않고
//	이름은 무조건 해당 클래스 이름과 정확히 같게 만들어줍니다.	
//객체 생성의 자율성 부여
	public OverTest() {
		this.a = "0";
		this.b = 1;
	}
	public OverTest(String a) {
		this.a = a;
		this.b = 2; 
	}
	public OverTest(int b) {
		this.a = "3";
		this.b = b;
	}
	public OverTest(String a, int b) {
		this.a = a;
		this.b = b;
	}

	public void showData() {
		System.out.println("a의 값 :" + a);
		System.out.println("b의 값 :" + b);
		System.out.println("------------");
	}
}
