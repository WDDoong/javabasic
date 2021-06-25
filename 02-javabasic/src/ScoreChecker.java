import java.util.Scanner;

public class ScoreChecker {
	
	public static void main(String[] args) {
		//성적 찬독기를 만들어보겠습니다.
		//if ~ else if ~ else구문을 사용해 만들어주세요.
		//성적기준은 95점이상 A+, 90이상 A, 85이상 B+
		//
		//
		//
		//60미만 F로 프린트 구문 으로 콘솔에 출력해주세요.
		//스캐너로 int score변수에 성적을 입력받습니다.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력해주세요.");
		int score = scan.nextInt();
		
		if (95 <= score) {
			System.out.print("A+");
		}else if (90 <= score) {
			System.out.print("A");
		}else if (85 <= score) {
			System.out.print("B+");
		}else if (80 <= score) {
			System.out.print("B");
		}else if (75 <= score) {
			System.out.print("C+");
		}else if (70 <= score) {
			System.out.print("C");
		}else if (65 <= score) {
			System.out.print("D+");
		}else if (60 <= score) {
			System.out.print("D");
		}else if (59 >= score) {
			System.out.print("F");
		}
		scan.close();
		System.out.println(" 입니다.");
	}

}
