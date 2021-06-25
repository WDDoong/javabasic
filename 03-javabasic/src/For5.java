
public class For5 {
	
	public static void main(String[] args) {
		/*
		 * 2~9단 까지 구구단을 출력하는 코드를 작성해주세요.
		 * 중첩 반복문을 써주시면 됩니다.
		 */
		
		for(int i=2; i<10; i++) {//for i 여는 부분
			System.out.println(i + " 단 구구단");
			
			for(int j =1; j<10; j++) {//for j 여는 부분
				System.out.println(i + " * " + j + " = " + (i * j));
			}//for j 여는 부분
			
		}//for i 닫는 부분
	}//메인 닫는 부분((바깥쪽n번을 안쪽n번 반복한다))
}
