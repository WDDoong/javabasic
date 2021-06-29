package interface1;

public class Voat implements Vehicle{
	
	private int speed;
	private int gas;
	private String name;
	
	public Voat(String name) {
		this.name = name;
		this.gas = VOAT_MAX_GAS;
		this.speed = 0;
	}

	@Override
	public void accel() {
		if(speed + 20 > 200) {
			speed = 200;
		}else {
			speed += 20;
		}
		gas -= 5;
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
		if(gas + 30 > VOAT_MAX_GAS) {
			gas = VOAT_MAX_GAS;
		}else {
			gas += 30;
		}
	}

	@Override
	public void showStatus() {
		System.out.println("보트 현재 속도 : " + speed);
		System.out.println("보트 현재 연료량 : " + gas);
		System.out.println("보트 주인 : " + name);
		System.out.println("----------------");
	}

}
