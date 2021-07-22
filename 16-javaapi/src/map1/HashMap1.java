package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	
	public static void main(String[] args) {
//		Map자료형의 대표 자료형은 HashMap입니다.
//		제네릭 내부에는 <Key자료형, Value자료형> 으로 작성합니다.
		Map<String, Integer> map = new HashMap<>();
		map.put("원예슬" , 1);
		map.put("국영수" , 2);
		map.put("코로나" , 3);
		System.out.println(map);
		
//		자료조회시는 .get(키값)으로 조회합니다.
//		무조건 key값으로 value를 조회 하지만 역으로 value값으로 key를 조회할 순 없다.
//		없는 key값으로 조회하면 null이 나온다.
//		인덱스 번호가 존재하지 않는다.
		System.out.println(map.get("코로나")); // map.get("바이러스"); = null
		System.out.println(map.get(0)); //  = null
		
//		기본적으로 map자료형은 조회도 key중심으로 이뤄진다.
//		.containsKey()는 해당 키값이 자료내에 존재하는지 확인한다.
		System.out.println(map.containsKey("원예슬"));
		System.out.println(map.containsKey("워너예슬"));
		
//		map자료형은 value값을 조회할 경우가 거의 없기때문에 .containsValue는 안쓴다고 보면 됨
//		remove는 key를 이용해서 key=value 전체를 삭제합니다.
		map.remove("코로나");
		System.out.println(map);
		
//		.size()는 크기를 알려줍니다. 정수로 몇개의 key=value쌍이 저장되어 있는지 확인할 수 있다.
		System.out.println(map.size());
	}

}
