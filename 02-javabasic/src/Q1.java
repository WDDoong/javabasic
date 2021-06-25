
public class Q1 {
	
	public static void main(String[] args) {
		//다음 로직대로 전위, 후위 수식을 이용해 코드를 작성해주시고
		//전위, 후휘수식코드는
		//Unay01.java에서 그랬듯
		//두 단계로 주석으로 풀어서 설명도 하세요.
		
		//1. a에 15를 선언및 초기화
		//2.a를 후위수식 감소시키면서 콘솔에 출력
		int a = 15;
		System.out.println(a--);
		//1. System.out.println(a(15));
		//2. a = a(15) - 1;
		
		//3.a를 콘솔에 찍습니다.
		//4.a를 전위수식 감소 시키면서 콘솔에 출력
		System.out.println(a);
		System.out.println(--a);
		//1. a = a(14) - 1; 
		//2. System.out.println(a(14));
		
		
		//5.a를 콘솔에 출력
		System.out.println(a);
	}
	
}
