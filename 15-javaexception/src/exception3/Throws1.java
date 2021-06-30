package exception3;

public class Throws1 {
	
//	특정 메서드 영역에서 발생하는 코드는 엄밀히 말하면 try블럭 외부의
//	예외발생으로 간주됩니다.
//	따라서 개념적으로는 try블럭 밖에 있지만 실제로는 try블럭에 속한 것 처럼
//	처리하기 위해 throws를 사용자 정의 메서드 뒤에 붙여줍니다.
	public static void doIt(String[] s, int i) {
		//throws ArrayIndexOutOfBoundsException { >>두잇에서 이런 예외가 있다면 트라이 내부로 throw해주라는 명령
		System.out.println(s[i]);
	}
	
	public static void main(String[] args) {
		String[] greetings = {"안녕", "Hi", "니하오", "신짜오"};
		int i = (int)(Math.random()*5); //정수0,1,2,3,4
		
		try {
			doIt(greetings, i);
		}catch (Exception e) {
			System.out.println("main지역에서 처리했습니다.");
		}
	}
}
