package thiskeyword;

public class Person {
//	사람의 정보를 여기에 기입합니다
	public String name;
	public int age;
	public int money;
	public String major;
	
//	생성자를 활용합니다.
	public Person(String name, int age, int money, String major) {
		this.name = name;
		this.age = age;
		this.money = money;
		this.major = major;
	}//this는 호출되고 있는 자기자신의 번지수를 의미
//	메인에서 입력한 값을 힙의 주소로 적재해줌★★★★★
	
//	getInfo()를 이용해 조회합니다.
	public void getInfo() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("소지금액 :" + money);
		System.out.println("전공 :" + major);
	}

}
