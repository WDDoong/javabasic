package lotto;

public class IfElse {
	
	public static void main(String[] args) {
		/*
		 * if(조건식) {	---------------조건식이 true일 경우 실행
		 * 	실행문; 
		 * }else {	----------------조건식이 false일 경우 실행
		 * 	실행문;
		 * }
		 * 
		 */
		
		int score = 85;
		
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}

}
