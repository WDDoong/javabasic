package jump2java;

public class String1 {
	
	public static void main(String[] args) {
//		문자열의 값을 비교할때는 반드시 equals를 사용해야한다.
//		==연산자는 객체의 주소값만을 비교하는 연산자기 때문이다.
		
		
		// equals
		String a = "hello";
		String b = "java";
		String c = "hello";
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		// primitive(원시)자료형
		boolean result = true;
		char capitalC = 'C';
		int i = 100000;
		
		// indexOf
		// Hello Java라는 문자열에서 "Java"라는 문자열은 7번째 문자'J'부터 시작이다.
		// 결과값이 6으로 나온 이유는 자바는 숫자를 0부터 세기 때문.
		String d = "Hello Java";
		System.out.println(d.indexOf("Java"));
		
		// replaceAll
		String e =  "Hello Java";
		System.out.println(e.replaceAll("Java", "World"));
		
		//substing
		//문자열중 특정 부분을 뽑아낼 경우 사용한다.
		String f = "Hello Java";
		
	}
	
	

}
