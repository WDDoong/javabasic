package constructor;

public class BasketballPlayer {
	
	public int height;
	public int jump;
	
	public BasketballPlayer(int h, int j) {
		height = h;
		jump = j;
		System.out.println("농구선수 생성 완료 :" + "키 ="+ height +", 점프력 ="+ jump);
	}
	public void dunkShoot() {
		if(height+jump>=300) {
			System.out.println("덩크슛에 성공했습니다.");
		}else {
			System.out.println("골대에 닿지 않았습니다.");
		}
	}
	
}
//멤버변수=파란색