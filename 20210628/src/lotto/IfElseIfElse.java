package lotto;

public class IfElseIfElse {
	
	public static void main(String[] args) {
	/*
	 * 여러개의 조건식을 사용해야 하는 경우 if-else를 활용하여 false인 조건식들은 건너뛰고
	 * true가 되는 블록만 실행할 수 있습니다.
	 * 
	 * if(조건식1) {
	 * 	실행문1;		조건식1이 true인 경우 실행
	 * }
	 * else if(조건식2) {
	 * 	실행문2;		조건식1이 false고, 조건식2가 true인 경우 실행
	 * }else {
	 * 	실행문3;		조건식1과 2가 false인 경우 실행
	 * }
	 *
	 */
	
	int score = 63;
	
	if(score >= 90) {
		System.out.println("점수가 100-90입니다.");
		System.out.println("등급은 A입니다.");
	}
	else if(score >= 80) {		//80 <= score < 90
		System.out.println("점수가 80-89입니다.");
		System.out.println("등급은 B입니다.");
	}
	else if(score >= 70) {		//70 <= score < 80
		System.out.println("점수가 70-79입니다.");
		System.out.println("등급은 C입니다.");
	}else {		//60 <= score < 70
		System.out.println("점수가 60-69입니다.");
		System.out.println("등급은 D입니다.");
	}
	}
}
