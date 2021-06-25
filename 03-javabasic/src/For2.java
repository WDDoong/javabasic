import java.util.Scanner;

public class For2 {
	
	public static void main(String[] args) {
		/*
		 * Hello Java를 입력한 횟수만큼 출력하는 구문을 작성하세요.
		 * 입력은 스캐너로 씁니다.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("반복횟수를 입력하세요.");
		int loop = scan.nextInt();
		
		for(int a = 1; a <= loop; a++) {
			System.out.println("Hello Java" + a);
		}
		scan.close();
	}

}
