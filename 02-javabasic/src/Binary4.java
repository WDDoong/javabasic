
public class Binary4 {
	
	public static void main(String[] args) {
		/*
		 * 비트 이동 연산자는 숫자 >>(<<)자릿수 문법으로 꺽쇠의 방향이
		 * <<인 경우는 왼쪽으로, 입력된 자리수 만큼 밀어줍니다.
		 * 이때 정수 숫자는 2의 자릿수 제곱만큼 증가합니다.
		 * >>인 경우는 2의 자릿수 제곱만큼 크기가 줄어듭니다.
		 */
		int a =80;
		System.out.println(a >> 3);
		System.out.println(a << 3);
		 
	}

}
