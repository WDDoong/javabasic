
public class Star05 {
	
	public static void main(String[] args) {
		//*****
		// ****
		//  ***
		//   **
		//    *
		
		for(int i=0; i<5; i++) {
			for(int k=0; k<i; k++) {
				System.out.print(" ");
			}//for k
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}//for j
			System.out.println();
		}//for i
		System.out.println();
	}

}
