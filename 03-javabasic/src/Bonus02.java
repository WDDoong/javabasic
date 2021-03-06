import java.util.Scanner;

public class Bonus02 {
	/*
	 * 이중 반복문을 이용해
	 * n을 입력받았을때 4~n까지의 범우
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("몇 까지의 숫자 중 소수만 탐색하시겠습니까?");
		int finalNum = scan.nextInt();
		boolean isOk;
		for(int i=4; i<finalNum; i++) {
			isOk = false;
			for(int j=2; j<i; j++) {
				if(i % j == 0) {
					isOk = true;
				}
				if((i-1 == j) && !isOk) { //false가 맞지만 false일때를 출력하고싶기 때문에 !를 써서 입력.
					System.out.println(i + "은 소수 입니다.");
				}
			}
		}
		scan.close();
	}

}
