import java.util.Scanner;

public class Break04 {
	
	public static void main(String[] args) {
		/*
		 * Scanner로 정수를 입력받으세요.
		 * 1~n까지 차곡차곡 순서대로 더해나갔을때
		 * 1부터 몇까지 더해야 입력된 정수를 초과하는지 
		 * 계산해주는 프로그램을 작성해주세요.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("수의 총 합이 몇 이상이 되면 종료하시겠습니까?");
		int a = scan.nextInt();
		
		int total = 0;
		int round = 1;
		while(true) {
			total += round;
			System.out.println("1부터"+ round +"까지의 총합은 :" + total  +"입니다.");
			
			if(total >= a) {
				System.out.println("목표값 : " + a);
				System.out.println("총합 : " + total);
				System.out.println("몇번째까지 더했나? : " + round);
				break;
			}
			round ++;
		}
	
		scan.close();

	}	
}
