package random1;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
	
	public static void main(String[] args) {
//		Random객체를 생성한 다음 nextBoolean()기능을 이용해서
//		동전던지기 카운팅 프로그램을 만들어주세요.
//		n회 던졌을 때 true = 앞면, false = 뒷면 몇 회인지 콘솔에 출력해주세요.
//		실행횟수 n회는 스캐너로 입력 받습니다.
		Scanner scan = new Scanner(System.in);
		System.out.println("동전 던질 횟수를 알려주세요.");
		int count = scan.nextInt();
		System.out.println(count + "바퀴 돌린 결과 값 : ");
		
		int front = 0;
		int back = 0;
		
		Random random = new Random();
		
		for(int i=0; i<count; i++) {
			if(random.nextBoolean()) {
				front++;
			}else {
				back++;
			}
		}
		System.out.println("앞면 : " + front);
		System.out.println("뒷면 : " + back);
	}

}
