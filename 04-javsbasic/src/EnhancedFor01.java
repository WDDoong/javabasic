
public class EnhancedFor01 {
	
	public static void main(String[] args) {
		/*
		 * 향상된 for문은 반복문 진행시 타겟으로 배열을 넣습니다.
		 * 이 경우 반복 실행 횟수는 배열의 내부요소 갯수만큼입니다.
		 */
		int[] arr1 = {100, 211, 339, 475, 591};
		
		for(int a : arr1) {
			System.out.println(a);
		}
		System.out.println("----------");
		for(int i=0; i<arr1.length; i++) {// .length = 내부요소 길이(갯수) 만큼
			System.out.println(arr1[i]);
		}//컴퓨터는 0번부터 카운트한다. i=0; 이라면 arr1의 0번째는 <100>
	}

}
