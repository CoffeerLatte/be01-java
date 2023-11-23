// 과제 3: 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 = ? 7.07
// 과제 4: 3개 정수를 입력 받아서 큰 순으로 출력


package day04_homework;

public class QuizEx03 {

		public static void main(String[] args) {
			
			//int i=1 ,cnt=0;
			double  cnt2=0;
					int i=1 ,cnt=0;
			
			
			
			for ( i = 1; i <= 9; i++) {
				cnt = (i+1);
				 cnt2 = cnt2 + ((double)i/(double)cnt);
				 

			}
		System.out.println(cnt2);
		}
}
