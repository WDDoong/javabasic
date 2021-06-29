package interface1;

public class Main1 {
	
	public static void main(String[] args) {
//		자동차 생성 및 사용
//		생성시 Car타입 하나와 Vehicle타입 하나 이렇게 두 종을 만들어서 써보세요.
		Vehicle v1 = new Car("원예슬");
		v1.accel();
		v1.showStatus();
		
		Car c1 = new Car("예슬");
		c1.accel();
		c1.showStatus();
	}

}
