package math1;

public class Math5 {

	public static void main(String[] args) {
//		주사위 게임을 만들어주세요.
//		주사위 게임은 내 값은 myValue변수에,
//		컴퓨터 값은 comValue변수에 값을 난수발생으로 1~6번으로 부여한 뒤
//		값이 같다면 무승부, 값이 다르면 나or컴퓨터중 승자를 알려주는 방식입니다.
		
		int myValue = (int)(Math.random() * 6) + 1;
		int comValue = (int)(Math.random() * 6) + 1;
		
		if(myValue == comValue) {
			System.out.println("무승부입니다.");
		}else if(myValue > comValue) {
			System.out.println("User 승");
		}else {
			System.out.println("컴퓨터 승");
		}
		System.out.println("내 값 : " + myValue);
		System.out.println("컴퓨터 값 : " + comValue);
	}
}
