import java.util.Scanner;

public class Scanner3 {
	
	public static void main(String[] args) {
				
		Scanner scan = new Scanner(System.in);
		
		// 환율
		double rate = 1117.40;
		
		System.out.println("미국 달러의 환율은" + rate + "입니다.");
		System.out.println("원화를 입력해주세요.");
		
		// 금액
		int won = scan.nextInt(); 
		
		//Math.round(); 반올림
		// %.6f 소숫점 아래 6자리까지 나타내줌
		// 환율 조건 , 1달러에 우리돈 1117.40 
		System.out.println("원화" + won + "원을 달러로 환전시" + " $" + Math.round(won / rate) + "입니다,.");

		
		scan.close();
		
	}

}
