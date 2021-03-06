package heapmemory;

public class StringComparison {
	
	public static void main(String[] args) {
//		문자열은 컴퓨터만 알 수 있는 마침표값의 칸이 있다.(ex. Hello는 6칸) 
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1);
		System.out.println(str2);
		
//		자바에서는 문자열의 일부분만 변경할 수 없다.
//		str[1] = "a";
		
//		str1과 str2의 주소 비교를 위해서는 ==를 씁니다.
//		str1과 str2의 문자 비교를 위해서는 .equals()를 씁니다.
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
//		new 키워드로 생성시 내용이 같은 문자열도
//		별개의 공간에 저장됩니다.
		String str3 = new String("Hello");
		System.out.println(str1 == str3); //주소 비교 결과 같지 않음.
		System.out.println(str1.equals(str3));//문자 비교 결과는 같음.
	}

}
