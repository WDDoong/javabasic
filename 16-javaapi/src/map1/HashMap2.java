package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {
	
	public static void main(String[] args) {
//		식당 메뉴판 만들기!
//		key는 음식이름, value는 가격(정수)로 저장해주세요.
//		메뉴는 5개 이상.
//		메뉴를 3개 조회해서 화면에 출력.
		
		// Map, HashMap 어느것이든 노상관
		Map<String, Integer> menu = new HashMap<>();
		
		menu.put("김치볶음밥" , 7000);
		menu.put("국수" , 5000);
		menu.put("김밥" , 3000);
		menu.put("떡볶이" , 4500);
		menu.put("라면" , 3000);
		System.out.println(menu);
		
		System.out.println(menu.get("국수"));
		System.out.println(menu.get("김치볶음밥"));
		System.out.println(menu.get("라면"));
	}

}
