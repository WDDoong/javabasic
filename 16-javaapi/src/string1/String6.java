package string1;

public class String6 {

	public static void main(String[] args) {
//		substring()은 인덱스 기준으로 앞 문자열을 삭제합니다.(몇번부터 남겨줄지)
//		인덱스 번호를 두 개 주면 처음 인덱스 번호~ 두번째 인덱스 번호 사이만 남겨줍니다.
		
		String str = "자바자바JSPJSP스프링스프링";
		String result = str.substring(5);//5번째 자리를 새로운 시작점으로 잡겠다.
		System.out.println(result);
		
		result = str.substring(10, 15);//10부터 입력시작, 15전까지만 입력 (15번 부터는 생략)
		System.out.println(result);
	}
}
