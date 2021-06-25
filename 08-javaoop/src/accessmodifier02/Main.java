package accessmodifier02;

public class Main {
	
	public static void main(String[] args) {
//		Parent를 상속받은 Child내부의 자료 조회
		Child child = new Child();
//		1. public자료
		System.out.println(child.a);//public
//		2. protected 자료
//		현재 Main.java와 같은 패키지 내부에 Parent, Child가
//		존재하므로 protected접근 가능
		System.out.println(child.b);//protected
//		3. private자료
		//System.out.println(child.c);//private 패런트를 받아왔지만 차일드로 생성이 됐기때문에 패런트와 같은 존재로 취급 불가  
		
//		4. default자료
		System.out.println(child.d);
	}

}
