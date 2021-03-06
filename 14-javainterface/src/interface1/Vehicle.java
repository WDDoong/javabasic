package interface1;

//인터페이스는 interface 선언을 사용합니다.
//내부에는 상수 변수, 추상 메서드만을 선언할 수 있습니다.
//애포에 구현(implements)을 전제로 설계되기 때문에
//일반변수, 메서드를 내부에 선언할 수 없습니다.
public interface Vehicle {
	//최대연료량
	int CAR_MAX_GAS = 100;
	int VOAT_MAX_GAS = 500;
	int HELICOPTER_MAX_GAS = 700;
	
//	탈것이라면 가지고 있을 공통적 기능을 전부 추상메서드로 작성
//	{
//		실행문...
//	}
//	부분없이 작성
	public void accel(); //가속
	public void breakspeed(); //감속
	public void reFuel(); //주유
	public void showStatus(); //계기판조회
//	위 네개는 받는쪽에서 오버라이딩을 무조건 해줘야 함
	
}
