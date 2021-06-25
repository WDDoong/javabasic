package date210623.method;

public class MethodBonus02 {
	
//	void가 아닌 리턴 자료형을 가지는 메서드도
//	리턴구문 실행시 종료됩니다. 값도 배달하는 역할, 2가지 역할을 함
	public static int getInt() {
		System.out.println("인트 발송 전");
		if (3 < 5) {
			return 1;
		}
		System.out.println("인트 발송 후");
		return 0;
	}
	
	public static void main(String[] args) {
//		리턴된 숫자를 출력하는 첫번째 방법
//		1. int result = getInt();
		
//		  System.out.println(result);
//		2. 리턴된 숫자를 출력하는 두번째 방법
		System.out.println(getInt());
		//getInt();//return 0;
	}

}
