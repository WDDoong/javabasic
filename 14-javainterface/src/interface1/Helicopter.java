package interface1;

public class Helicopter implements Vehicle{
	
	private int speed;
	private int gas;
	private String name;
	
	public Helicopter(String name) {
		this.name = name;
		this.gas = HELICOPTER_MAX_GAS;
		this.speed = 0;
	}

	@Override
	public void accel() {
		if(speed + 30 > 200) {
			speed = 200;
		}else {
			speed += 30;
		}
		gas -= 3;
	}

	@Override
	public void breakspeed() {
		if(speed - 10 < 0) {
			speed = 0;
		}else {
			speed -= 10;
		}
	}

	@Override
	public void reFuel() {
		if(gas + 100 > HELICOPTER_MAX_GAS) {
			gas = HELICOPTER_MAX_GAS;
		}else {
			gas += 100;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("헬기 속도 : " + speed);
		System.out.println("헬기 현재 연료량 : " + gas);
		System.out.println("헬기 주인 : " + name);
		System.out.println("----------------");
	}

}
