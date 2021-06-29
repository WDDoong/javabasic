package abstract1;

//Parent내부에 불완전한 메소드인 getA()가 존재하기 때문에
//Override를 해줘야함.
public class Child extends Parent{
	
	public void getA() {
		System.out.println(a + "가 저장되어있던 값입니다.");
	}
}//implements 불완전한 메소드 오버라이드
