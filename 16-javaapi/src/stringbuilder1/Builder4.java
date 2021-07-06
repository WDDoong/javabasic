package stringbuilder1;

public class Builder4 {
	
	public static void main(String[] args) {
//		String관련에서 CharAt()은 기본적으로 한글자를 의미합니다.
//		deleteCharAt은 문자열 내부에서
//		지정된 인덱스번호에 해당하는 딱 한글자만 삭제하는 로직을 의미한다.
		StringBuilder a = new StringBuilder("asdfasdfasdf");
		System.out.println(a);
		a.deleteCharAt(0);
		System.out.println(a);
	}

}
