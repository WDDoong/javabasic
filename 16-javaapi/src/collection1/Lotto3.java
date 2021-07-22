package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto3 {
	
	public static void main(String[] args) {
//		로또복권 당첨 시뮬레이터를 만들어주세요.
//		1. 당첨번호 6개를 뽑습니다.
//		2. 추첨번호 6개를 뽑습니다.
//		3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
//		4. 3에서 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호 6개를 뽑고
//			이어서 비교해서 일치여부 검사
		List<Integer> lotto = new ArrayList<>();
		List<Integer> myNum = new ArrayList<>();
		Random num = new Random();
		int getNum = 0;
		
		// 당첨 번호 6개 추출
		while(lotto.size() != 2) { 
			getNum = num.nextInt(45) + 1;
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
		Collections.sort(lotto);
		System.out.println("추첨번호 : " + lotto);
		//1번 로직 끝
		
		long count = 0;
		long money = 0;
		while(!lotto.equals(myNum)); {
			count++;
			myNum.clear();
			while(myNum.size() != 6) {
				getNum = (int)(Math.random() * 45) + 1;
				if(!myNum.contains(getNum)) {
					myNum.add(getNum);
				}
				money = count * 1000;
			}
			Collections.sort(myNum);
			System.out.println("이번에 뽑힌 번호 : " + myNum);
		}
		
		System.out.println("당첨번호 : " + myNum);
		System.out.println("총 로또 복권을 " + money +"원 구입해야 1등에 당첨 됩니다.");
		
	}

}
