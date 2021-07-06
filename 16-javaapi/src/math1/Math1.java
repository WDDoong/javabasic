package math1;

public class Math1 {

	public static void main(String[] args) {
//		Math는 자바에서 이미 기본으로 제공하는 기능이라
//		import없이 사용 가능합니다.
		int a = -1024;
		System.out.println(Math.abs(a));//absolute number 절대값
		
		double b = 3.14;
		System.out.println(Math.ceil(b));//올림값
		
		double c = 19.9;
		System.out.println(Math.floor(c));//내림값. 소수점 아래를 버림
	}

}
