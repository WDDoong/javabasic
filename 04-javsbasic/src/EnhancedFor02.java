
public class EnhancedFor02 {
	
	public static void main(String[] args) {
		/*
		 * 다음은 학생들의 과목별 성적입니다.
		 * math = 96, 23, 52, 82 72 31 58
		 * eng = 62 42 68 31 80 77 45
		 * com = 10 28 39 74 65 90 98
		 * 위 3개의 명칭으로 array를 만들어 담아주신 다음
		 * 과목별 평균점수를 enhanced for문을 이용해 구한 다음
		 * 콘솔창에 출력해주세요.
		 *--------------------------------------------
		 * 과목별 평균을 구해주시되
		 * 영어는 일반 for문을 이용해 총합을 구한 뒤 평균을 찍어주시고
		 * 컴퓨터는 향산된 for문을 이용해 총합을 구한 뒤 평균을 찍어주세요.
		 */

		int[] math = {96, 23, 52, 82, 72, 31, 58}; //참조형이기 때문에 math는 표지판 역할.
		int[] eng = {62, 42, 68, 31, 80, 77, 45};
		int[] com = {10, 28, 39, 74, 65, 90, 98};
		
		int mtotal = 0;
		
		for(int score : math) {
			mtotal += score;
		}
		System.out.println("수학평균 : " + mtotal/math.length);

		int etotal = 0;
		
		for(int i=0; i<eng.length; i++) {
			etotal += eng[i];
		}
		System.out.println("영어평균 : " + etotal/eng.length);

		int ctotal = 0;
		
		for(int score : com) {
			ctotal += score;
		}
		System.out.println("영어평균 : " + ctotal/com.length);
		}
			

						
	}	
/*	
 * 	
int[] math = {96, 23, 52, 82, 72, 31, 58}; //참조형이기 때문에 math는 표지판 역할.

int mtotal = 0;
for(int score : math) {
	mtotal += score;
}
System.out.println("수학평균 : " + mtotal/math.length);

int[] eng = {62, 42, 68, 31, 80, 77, 45};

int etotal = 0;
for(int score : eng) {
	etotal += score;
}
System.out.println("영어평균 : " + etotal/eng.length);

int[] com = {10, 28, 39, 74, 65, 90, 98};

int ctotal = 0;
for(int score : com) {
	ctotal += score;
}
System.out.println("영어평균 : " + ctotal/com.length);

*/
