
public class Method03 {
	
	public static void plus(int a, int b) { //명칭이나 자료형은 그때 필요한 것으로 대입할 수 있음
		/*
		 * 내부 실행문에서 두개 이상의 변수를 요구한다면
		 * 두 개 이상의 매개변수를 선언할 수 있습니다.
		 * 이 경우 상대적인 위치에 맞춰서 전달됩니다.
		 */
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		plus(3, 5);
		//System.out.println(a);
		//플러스가 끝난시점에서 메모리에서 a가 사라짐  
	}

}
