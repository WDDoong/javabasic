package lotto;

public class If {
	
	public static void main(String[] args) {
		/*
		 * if(조건식) {
		 * 	실행문;
		 * 	실행문;
		 * }
		 * 조건식이 true일 때 아래 실행문들 동작, false면 미실행
		 */
		
		
		
		int score = 85;
		
		if(score >= 90) {	//score = 85이므로 score >= 90 조건은 false
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if(score < 90) {	//score = 85이므로 score < 90 조건은 true 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
	}

}
