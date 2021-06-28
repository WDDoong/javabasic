package static2;

public class Main {
	
	public static void main(String[] args) {
//		Asean 조원 없이도 Asean조별점수는 조회 가능하다.
//		System.out.println("조별 과제 점수 : "+ Asean.score);
		System.out.println("--------------");
		
		Asean a1 = new Asean(10, 20, 5);
		Asean a2 = new Asean(20, 10, 5);
		Asean a3 = new Asean(10, 20, 5);
		Asean a4 = new Asean(20, 10, 5);
		
		a1.showAseanInfo();
		a2.showAseanInfo();
		a3.showAseanInfo();
		a4.showAseanInfo();
	}

}
