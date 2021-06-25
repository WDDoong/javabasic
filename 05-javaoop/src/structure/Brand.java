package structure;

public class Brand {
	
	public String name;
	public int since;
	public String country;

	public void getInfo(Brand b) {
		System.out.println("브랜드 이름 :"+ b.name);
		System.out.println("브랜드 창립 년도 :" + b.since);
		System.out.println("나라 :" + b.country);
	}
	

}
