package string1;

public class String8 {
	
	public static void main(String[] args) {
//		trim()은 문자 시작전과 문자끝의 모든 공백을 없애줍니다.
		String str = "                Hello               Java         ";
		System.out.println(str.trim());
		
		
		//replace()를 이용해서 공백 전체를 없애보세요.
		System.out.println(str.replace(" ",""));
		
//		trim()과 replace()를 이용해 Hello Java사이의 공백을 한칸만 남겨보세요.
		System.out.println(str.trim().replace("  ", ""));//본래 홀수 칸이라면 이 명령 가능.
		//메서드 체이닝(메서드가 연쇄적으로 실행)
	}

}
