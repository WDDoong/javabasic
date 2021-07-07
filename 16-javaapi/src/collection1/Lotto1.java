package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lotto1 {
	
	public static void main(String[] args) {
//		로또복권 추첨기를 만들어보겠습니다.
//		로또복권 추첨기는 1이상 45이하의 범위에서 겹치는 숫자 없이
//		6개의 숫자를 뽑습니다.
//		순서를 정렬해서 출력하도록 만들어주세요.
//		ArratList의 정렬은 .sort()대신 Collections.sort(리스트); 를 이용해 정렬합니다.
		List<Integer> lotto = new ArrayList<>();
		Random num = new Random();
		
		int getNum = 0;
		
		while(lotto.size() != 6) { //6개가 아니면 계속 반복, 6개면 탈출
			getNum = num.nextInt(45) + 1;//무작위 번호 45개 추출
			if(!lotto.contains(getNum)) {
				lotto.add(getNum);
			}
		}
		Collections.sort(lotto);
		System.out.println("추첨된 번호 : " + lotto);
		
		
		//2등 당첨 번호는 위에서 나온 6개 번호를 제외하고 출력 해야함.
				
		
	}

}
