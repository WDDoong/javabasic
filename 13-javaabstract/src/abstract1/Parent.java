package abstract1;

//추상 클래스
//abstract선언이 붙은 클래스는 new를 이용한
//직접적인 객체 생성이 불가능하다. (6클래스, 14매소드 은 항상 붙어다니는 애들
public abstract class Parent {
	public int a;
	
	public Parent() {
		this.a = 5;
	}
	
//	추상 메소드, 아래와 같이 실행문 없이 작성한다. 오버라이딩 필수
	public abstract void getA();
	
//	추상클래스 내부의 일반 메소드는 그냥 평범하게 작성한다. 오버라이딩 안해도 됨
	public void getInfo() {
		System.out.println("일반 메서드입니다.");
	}

}
//오버라이딩 목적이기 때문에 내부에 상세히 작성할 필요가 없다.