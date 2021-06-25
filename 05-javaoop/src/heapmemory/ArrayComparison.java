package heapmemory;

import java.util.Arrays;

public class ArrayComparison {
	
	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = arr1;
		int[] arr3 = {1, 2, 3, 4, 5}; 
//		문자열과 다르게 일부 내용만 수정가능.
		arr1[0] = 10;
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		
//		주소값이 아닌 전체 배열 데이터를 보고싶다면
//		Arrays입력 후 ctrl + spacebar로 import를 우선 해준다.
//		Arrays.toString(배열); 문법을 사용합니다.
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

}
