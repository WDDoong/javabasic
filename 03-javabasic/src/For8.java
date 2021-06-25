
public class For8 {
	
	public static void main(String[] args) {
		//트리모양 (피라미드)로 * 출력하기
		//오른쪽정렬 피라미드 출력하기
		for(int i=0; i<5; i++) {
			
				for(int j=4; j>i; j--) {
					System.out.print(" ");
				}
				for(int k=0; k<=i; k++) {
					System.out.print("*");
				}
				System.out.println();
		}		
		System.out.println();
		
		
	}

}
