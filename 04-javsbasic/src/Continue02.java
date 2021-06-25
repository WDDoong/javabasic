import java.util.Scanner;

public class Continue02 {
	
	public static void main(String[] args) {
		/*
		 * 1부터n까지 총합을 구하되 홀수 끼리만 더한
		 * 총 합 을 구하는 구문을 작성햐주세요.
		 * continue문을 반드시 사용하는 로직으로 작성해주숑,
		 * n은 스캐너로 입력받습니다.
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("목표 정수를 입력해주세요.");
		int num = scan.nextInt();
		
		int total = 0;
		int count = 0;
		while(count<num) {
			count += 1;
			if(count % 2 ==0) {
				continue;				
			}
			 total += count;
			 
			 System.out.println("현재 1부터"+ count +"까지 더했습니다.");
			 System.out.println("총 합은" + total + "입니다.");
			}
		scan.close();
				
	}
}


		
