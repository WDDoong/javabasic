package structure;

public class ClassMain02 {
	
	public static void main(String[] args) {
		
		Brand bd1 = new Brand();
		Brand bd2 = new Brand();
		
		bd1.name = "샤넬 chanel"; 
		bd1.since = 1910;
		bd1.country = "프랑스 파리";
		
		bd2.name = "로에베";
		bd2.since = 1846;
		bd2.country = "스페인 마드리드";
		
		bd1.getInfo(bd1);
		System.out.println("-------------");
		bd2.getInfo(bd2);
	}

}
