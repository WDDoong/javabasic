package accessmodifier03;

import accessmodifier02.Child;

public class Main01 {
	
	public static void main(String[] args) {
//		패키지가 다른 (accessmodifier2의) child를 생성
//		패키지가 다르면 import까지 해줘야 쓸 수 있음!!
		Child child = new Child();
		
//		1. public 접근제한자
//		System.out.println(child.a);
//		2. protected 접근제한자
//		System.out.println(child.b);//메인은 a3패키지지만 child가 a3소속이라면 출력가능
//		3. private 접근제한자
//		System.out.println(child.c);
//		4. default 접근제한자
//		System.out.println(child.d);
	}

}
