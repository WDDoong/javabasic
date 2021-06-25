package thiskeyword;

public class Main {
	
	public static void main(String[] args) {
//		this가 적용된 Person 생성하기
//		생성시 ctrl + Space를 누르면 입력한 요소가 출력됨
		Person p1 = new Person("김이박", 30, 4000, "식품영양학");
		p1.getInfo();
		
		Person p2 = new Person("최나박", 25, 50000, "화학");//힙 안에서 나온게 아닌 생성자에 의해 던져진 값.
		p2.getInfo();
		
	}

}
