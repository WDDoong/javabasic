
public class Continue03 {
	
	public static void main(String[] args) {
		/*
		 * 다음은 학생들의 과목별 성적입니다.
		 * math = 96, 23, 52, 82, 72, 31, 58
		 * eng = 62, 42, 68, 31, 80, 77, 45
		 * com = 10, 28, 39, 74, 65, 90, 98
		 * 각 과목별 평균점수를 내주시되, 합격자 평균만 내주세요.
		 * 합격점수는 60점 이상입니다.
		 * 
		 * 1.총첨 변수와 합격자수 변수 생성
		 * 2.반복문 실행
		 * 3.검사해서 60점 미만이면 continue
		 * 4.60점 이상이면 합격자수 +1, 총점에 합격점수 더하기
		 * 5.다 돌고 나오면 총점/합격자수로 합격자 평균 내기
		 */
		int total = 0;
		int count = 0;
		for(int score:math) {
			if(score<60) {
				continue;
			}else {
				System.out.println(total);
			}
		}
		}
		
}
