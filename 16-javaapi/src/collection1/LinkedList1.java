package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
	
	public static void main(String[] args) {
//		LinkedList는 자료의 변경이 빈번할 때 사용하면 성능향상이 있다.
//		일반적인 상황에서는 ArrayList를 더 많이 쓰고, 
//		양 리스트 간 사용법에는 큰 차이가 없습니다.
		List<String> list1 = new LinkedList<String>();// ArrayList<>;로 바꿔도 결과는 같음
		list1.add("자바");
		list1.add("jsp");
		list1.add("스프링");
		list1.add("스프링부트");
		System.out.println(list1);
		
//		.remove()는 두 유형이 있습니다.
//		.remove(번호)를 넣을 경우 주어진 번호에 있는 자료가 삭제되고
//		.remove("자료")를 입력하면 번호와 상관없이 자료가 삭제됩니다.
		list1.remove(0); //0번 인덱스 "자바" 삭제
		System.out.println(list1);
		list1.remove("스프링"); //"스프링" 자료 삭제
		System.out.println(list1);
		
//		리스트를 전체적으로 비우고 싶을때는?
		list1.clear();
		System.out.println(list1);
		
//		4개 자료 아무거나 추가하기
		list1.add("영화");
		list1.add("음악");
		list1.add("독서");
		list1.add("그림그리기");
		
//		자료 정렬은 Collections.sort(list);
		Collections.sort(list1);
		System.out.println(list1);
		
		
		
		/*
		 * LinkedList와 ArrayList의 차이
		 * 
		 * ArrayList - 순차리스트, 배열기반 리스트
		 * 			빈칸(빈 인덱스)을 불허함. 가장 마지막 인덱스가 삭제 되고, 값이 앞자리로 옮겨옴.
		 * 			마지막 번호에 가까운 것을 삭제해야 덜수고스러움(번거로움)
		 * 
		 * LinkedList - 연결 리스트
		 * 			인덱스 안에 저장되는 데이터가 2개. (자료, 다음자리주소값)
		 * 			빈번하게 바뀌는 데이터를 다룰 때 유용.
		 * 			순차리스트와 다르게 물리적으로 삭제
		 * 			(단점)ArrayList보다 데이터크기가 큼
		 * 			
		 */
	}

}
