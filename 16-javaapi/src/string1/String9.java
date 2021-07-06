package string1;

public class String9 {
	
	public static void main(String[] args) {
//		기본적으로 문자열은 참조형 변수기때문에
//		비교를 할 때 주소값 비교가 일어납니다.
		String a = new String("테스트1");
		String b = new String("테스트1");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		
//		.equals()를 이용하면 문자열간 비교가 가능하다.
		System.out.println(a.equals(b));//a랑 b가 같은지 비교해라.
	}

}
