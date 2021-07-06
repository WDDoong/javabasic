package jump2java;

public class String1 {
	
	public static void main(String[] args) {
//		문자열의 값을 비교할때는 반드시 equals를 사용해야한다.
//		==연산자는 객체의 주소값을 비교하는 연산자기 때문이다.
		
		String a = "hello";
		String b = "java";
		String c = "hello";
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}

}
