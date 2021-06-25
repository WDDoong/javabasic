
public class Star04 {
	
	public static void main(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		for(int i=0; i<5; i++) {
			for(int k=4; k>i; k--) {
				System.out.print(" ");
			}//for k
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}//for j
			System.out.println();
		}
		System.out.println();
	}

}
