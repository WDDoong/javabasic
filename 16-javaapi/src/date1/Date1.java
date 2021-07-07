package date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
	
	public static void main(String[] args) {
//		Date는 날짜를 표현한느 클래스로 DB등과 통신할 때
//		Date를 이용해 날짜 자료를 받아오거나 넘겨주는것이 권장됩니다.
//		사용시 import를 해야 함.
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(strNow);
		
//		표현 양식을 바꿀때는 SimpleDateFormat을 활용한다.
//		import가 필요합니다. 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");// 분과 헷갈릴 수 있어서 월은 대문자M을 사용함.
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
