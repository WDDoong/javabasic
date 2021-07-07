package math1;

public class Math6 {
	
	public static void main(String[] args) {
//		가위바위보 게임을 만들어보겠습니다.
//		Math.random()을 이용해 1/3확률로 가위, 바위, 보를 부여받으며
//		가위>보, 바위>가위, 보>가위의 상성을 가집니다.
//		같은 요소가 나오면 무승부입니다.
//		힌트) 컴퓨터가 이기는 경우, 내가 이기는 경우, 비기는 경우를 따져서
//		조건식에 ||(or)을 사용합니다.
		int pcNum = (int)(Math.random() * 3) + 1 ; 
		int myNum = (int)(Math.random() * 3) + 1 ;
		
		//가위 = 1, 바위 = 2, 보 = 3
		// 상수 처리로 숫자 대신 알기쉬운 문자로 대입해서 유추 바로 가능.
//		final int Scissors  = 1;
//		final int Rock  = 2;
//		final int Paper  = 3;
		
		// 내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 치환해주는 배열
		String[] items = {"", "가위", "바위", "보"};
		
		if((pcNum == 1 && myNum == 2) || (pcNum == 2 && myNum == 3) || (pcNum == 3 && myNum == 1)) {
			System.out.println("내가 이겼다!");
		}else if((pcNum == 1 && myNum == 3) || (pcNum == 2 && myNum == 1) || (pcNum == 3 && myNum == 2)) {
			System.out.println("컴퓨터가 이겼다!");
		}else if(pcNum == myNum){
			System.out.println("비겼습니다.");
		}
		// 내가 낸 것과 컴퓨터가 낸 것을 출력해주는 부분
		System.out.println("내 값 : " + items[myNum]);
		System.out.println("컴퓨터 값 : " + items[pcNum]);
		
	}

}
