
public class Method02 {
	
	public static int add2(int a) {
		return a + 1; //인트+인트 = 결과는 무조건 인트
	}
	
	public static void main(String[] args) {
		/*
		 * 반환자료가 void가 아닌 경우는 호출 위치에 
		 * return문 오른쪽 자료를 그대로 갖다놓습니다.
		 * 자료를 반환하는것이 꼭 console창에 표시됨을 의미하지는 않습니다.
		 * 리턴 구문을 통해서 값을 옮겨주는지 아닌지만. 출력은 상관 없음.
		 */
		int b = add2(10); //호출위치 add2(10);  b에 11을 돌려받는 행위를 리턴이라 한다.
		System.out.println(b);
	}

}
