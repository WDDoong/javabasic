package interface1;

//인터페이스를 구현(상속이 아님!)하기 위해서는
//implements(extends가 아님) 키워드를 사용합니다.
//인터페이스 내부의 추상메서드는 무조건 구현해줘야한다.
public class Car implements Vehicle{
//	자동차라면 가져야 하는 변수 설정
//	현재속도, 현재연료량, 차주
	private int speed;
	private int gas;
	private String name;
	
	
//	생성자를 만들어주세요. 차주만 입력받고
//	나머지 요소는 현재 속도0, 연료량 100을 대입해줍니다.
	public Car(String name) {
		this.name = name;
		this.gas = CAR_MAX_GAS;
		this.speed = 0;
	}

	@Override
	public void accel() {
//		한번 가속시 속도가 10씩 늘어나도록 해주세요.
//		연료는 한번 가속에 1씩 소비합니다.
//		단, 속도는 200을 초과할 수 없습니다.

//		가속전에 가속시 200을 초과하는지 여부 확인
		if(speed + 10 > 200) {
			speed = 200;
		}else {
			speed += 10;
		}
//		가속 로직을 모두 점검한 후에 연료량 1차감
		gas -= 1;
	}

	@Override
	public void breakspeed() {
//		한번 감속시 속도가 10씩 줄어들게 해주세요.
//		단 속도는 0미만이 될 수 없습니다.
		if(speed - 10 < 0) {
			speed = 0;
		}else {
			speed -= 10;
		}
	}

	@Override
	public void reFuel() {
		// 연료를 다시 채울경우 30씩 채워줍니다.
		// 단 연료 최대값은 상수MAX_GAS를 이용해서 측정해주세요.
		if(gas + 30 > CAR_MAX_GAS) {
			gas = CAR_MAX_GAS;
		}else {
			gas += 30;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("현재 속도 :"+ speed);
		System.out.println("현재 연료량 :"+ gas);
		System.out.println("현재 차주 :"+ name);
		System.out.println("--------------");
	}

}
