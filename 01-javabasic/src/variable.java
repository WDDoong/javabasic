public class variable {
	public static void main(String[] args) {
		/*
		 * 변수는 기본적으로
		 * 자료형 변수명;(선언)
		 * 변수명 = 값;(초기화)
		 * 방식과
		 * 자료형 변수명 = 값;(선언 및 초기화)
		 * 두가지 방식으로 값을 대입할 수 있습니다.
		 */
		int a;//나는 a박스에 정수를 넣을 예정이다(아직안넣음)
		a = 5;//위의 a박스에 5를 넣겠다.
		int b, c; //b, c박스에 정수를 넣을 예정이다.
		b = 10;//b박스에 10을 넣겠다.
		c = 15;//c박스에 15를 담겠다.
		System.out.println(a);//a박스 내부값 출력
		System.out.println(b);//b박스 내부값 출력
		System.out.println(c);//c박스 내부값 출력
		a = 20;//a변수값 20으로 바꿈 (기존 5는 없어짐)
		System.out.println(a);//변경된 값 출력
	}

}