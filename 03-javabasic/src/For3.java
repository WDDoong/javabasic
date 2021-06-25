import java.util.Scanner;

public class For3 {
	
	public static void main(String[] args) {
		/*
		 * 구구단 출력기를 만들어 보겠습니다.
		 * 1~9중 하나의 숫자를 입력받습니다.
		 * 만약 1~9범위를 벗어난 숫자가 입력된다면
		 * "범위내의 수를 입력해주세요"라는 안내문구를 적고 종료합니다.
		 * 맞는 숫자가 들어온다면 결과예시처럼 출력합니다.
		 * ((if문 안에 for문 넣어서 하는거임))
		 */

















		Scanner scan = new Scanner(System.in);
		System.out.println("1~9중 하나의 숫자를 입력하세요.");
		int num = scan.nextInt();
				
		if (0 < num && num < 10) {
			for(int one = 1; one <= 9; one++) {
				System.out.println(num + " * " + one + " = " + (num * one));
			}
		}else System.out.println("범위내의 수를 입력해주세요.");

		
		scan.close();

	}

}
