package lotto;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
//	int[] lotto;		//1. 배열 lotto를 선언(참조변수)
//	lotto = new int[6]; //2. 배열의 생성(int저장공간 X6)
	
	public static void main(String[] args) {

		// 0. param setting
		// 결과값 배열 선언
		int[] resultNumArr = new int[6];
		// 임시값 변수 선언
		int tempNum = 0;
		// while 반복문 cnt
		int tempCnt = 0;
		// 중복확인 flag
		boolean flag;
		// 랜덤 객체 생성
		Random random = new Random();

		// 1. 랜덤 번호 생성
		while (true) {
			// 1-1. 최초 flag true
			flag = true;
			// 1-2. 랜덤번호 생성(1~45)
			tempNum = random.nextInt(45)+1;

			// 1-3 중복확인, 중복일시 플래그 false
			for (int i = 0; i < resultNumArr.length; i++) {
				if(tempNum == resultNumArr[i] ) {
					flag = false;
					break;
				}
			}
			
			// 1-4. 중복번호가 아닐 경우 배열에 삽입
			if(flag) {
				resultNumArr[tempCnt] = tempNum;
				tempCnt++;
			}
			
			// 1-5. 6개 번호 확인 후 반복문 종료
			if(tempCnt >= 6) break;
		}
		
		// 2. 결과 확인
		System.out.println("로또번호 :: " + Arrays.toString(resultNumArr));
		
	}
}
