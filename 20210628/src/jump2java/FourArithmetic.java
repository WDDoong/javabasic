package jump2java;

public class FourArithmetic {
	
	public static void main(String1[] args) {
		
		int a = 10;
		int b = 5;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println("%는 나머지 값을 반환");
		System.out.println(7 % 3);
		System.out.println(3 % 7);
		System.out.println("----증감연산");
		
		int i = 0;
		int j = 10;
		i ++;
		j --;
		System.out.println(i);
		System.out.println(j);
		System.out.println("후위수식");
		/*
		 * h++값이 참조된 후에 증가
		 * ++h값이 참조되기 전에 증가
		 */
		int h = 0;
		System.out.println(h++);//h문장이 실행된 이후에 h값이 증가하게 된다.
		System.out.println(h);
	}

}
