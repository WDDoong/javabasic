package final3;

public class Main {
	
	public static void main(String[] args) {
//		final 변수를 사용하기 위한 Country객체 생성 불필요
//		일반적으로 상수를 쓰는 경우는
//		한 구역만 수정해도 전체 프로그램에 수정 내용이
//		반영되게 만들고 싶을때 사용한다. 전체 프로그램에 영향을 주고 싶을때.
		System.out.println(Country.KOREA);
		System.out.println(Country.CHINA);
		System.out.println(Country.STATES);
		System.out.println(Country.CANADA);
		
		System.out.println("한국 넓이는 : " + Country.KOREA);
		System.out.println("한국 넓이는 : " + Country.KOREA);
		System.out.println("한국 넓이는 : " + Country.KOREA);
		System.out.println("한국 넓이는 : " + Country.KOREA);
		System.out.println("한국 넓이는 : " + Country.KOREA);
		System.out.println("한국 넓이는 : " + Country.KOREA);
	}

}
