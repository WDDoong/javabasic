
public class SwitchCase2 {
	
	public static void main(String[] args) {
		/*
		 * Math.random(); 을 이용해 난수를 하나 발급받을 수 있고
		 * 난수의 범위는 ★0초과 1미만★입니다.
		 * ()뒤에 원하는 숫자를 곱하면 입력한 숫자범위의 정수를 얻을 수 있습니다.(int)
		 */
		double number = Math.random();
		System.out.println(number);
		
		int intnum = (int)(Math.random() * 45);
		System.out.println(intnum);
		
		//switch~case문을 이용해서
		//식당이름을 출력하는 프로그램을 만들어보세요. (최소 6개)
		
		int lun = (int)(Math.random() * 7);
		switch(lun) {
		case 0:
			System.out.println("북창동순두부");
			break;
		case 1:
			System.out.println("들풀한상");
			break;
		case 2:
			System.out.println("삼첩");
			break;
		case 3:
			System.out.println("텃밭");
			break;
		case 4:
			System.out.println("마실랭가이드");
			break;
		case 5:
			System.out.println("샐러디");
			break;
		case 6:
			System.out.println("버거킹");
			break;
		/*
		   default:
			System.out.println("굶기");
		*/
		}
	}


}
