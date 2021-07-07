package arrays1;

import java.util.Arrays;

public class Arrays2 {
	
	public static void main(String[] args) {
//		Arrays.copyOf()는 특정 배열을 시작부터 n개만 잘라서 복사합니다.
		int[] arr = {1,2,3,4,5};
		
		int[] arrCopy = Arrays.copyOf(arr, 3); //인덱스 0부터 3번 직전까지만
		System.out.println(Arrays.toString(arrCopy));
		System.out.println(arrCopy);//참조형변수 특성상 저장된 주소값을 보여줌
		
//		만약 원본보다 길게 복사되면 나머지는 0으로 채워진다.
		int[] arrCopy2 = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arrCopy2));
	}

}
