
public class Method06 {
	/*
	 * mul메서드를 선언해주세요.
	 * 이 매서드는 여러분들이 임의로 이름붙인 정수 변수 3개를 입력받아
	 * 변수 3개를 곱한 값을 retrun해줍니다.
	 */
	
	/*
	 * info매서드를 선언해주세요. void 리턴 자료형 입니다.
	 * 이 매서드는 내부에서
	 * "안녕하세요."
	 * "자바 메서드 학습중입니다."
	 * "3줄을 한번의 호출로 적습니다." 라는 문장을 출력해줍니다.
	 */
	
	public static int mul(int a, int b, int c) {
		return a * b * c ;
	}
	
	public static void info() {
		System.out.println("안녕하세요.");
		System.out.println("자바 메서드 학습중입니다.");
		System.out.println("3줄을 한번의 호출로 적습니다.");
	}
	
	public static void main(String[] args) {
		//mul을 호출해 결과값을 int result에 저장하기.
		//저장된 값 콘솔창에 출력해 확인하기
		int result = mul(1, 2, 3);
		System.out.println(result);
		
		
		//info 메서드를 반복문으로 3번 호출하기.
		for(int i=0; i<3; i++) {
			info();
		}
	}

}
