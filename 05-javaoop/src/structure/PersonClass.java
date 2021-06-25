package structure;

public class PersonClass {
	
	public String name;
	public int age;
	public String pNum;
	public String address;
	public boolean glasses;
	
	//클래스 내부에 생성할땐 static 없어도 됨.
	//클래스는 자기와 같은 지역에 있는 요소를 소속 명시 없이 조회 가능합니다.
	public void getInfo(PersonClass p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
		System.out.println(p.glasses);
}
	
}
