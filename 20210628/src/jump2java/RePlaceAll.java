package jump2java;

public class RePlaceAll {
	
	public static void main(String[] args) {
//		replaceAll은 문자열 중 특정 문자를 다른 문자로 바꾸고 싶을 경우에 사용한다. 
//		replace와는 기능은 비슷하나 다른점이 있다.
		
//		String replace(CharSequnce target, CharSequence replacement)
//		String replaceAll(String regex, String replacement)
//		replaceAll은 첫번째 인자값에 정규식이 들어간다. 정규식을 이용하면 불특정 문자열을 변환할 수 있다는 장점이 있다.
		
		String str = "aaabbbccccabcddddabcdeeee";
		String result1 = str.replace("abc", "왕");
		String result2 = str.replaceAll("[abc]", "왕"); //정규식[]안에 있는 문자들을 전부 왕으로 변환시켜줍니다.
		
		System.out.println("replace result->" + result1);
		System.out.println("replace resultAll->" + result2);
		
	}

}
