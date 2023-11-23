// 과제 2: (-1) + 2 + (-3)+ 4+(-5)+ ... +(-9) + 10 = ? 5
// 과제 3: 1/2 + 2/3 + 3/4 + 4/5 + 5/6 + 6/7 + 7/8 + 8/9 + 9/10 = ? 7.07
// 과제 4: 3개 정수를 입력 받아서 큰 순으로 출력

package day04_homework;

public class QuizEx02 {

	public static void main(String[] args) {
		
		int cnt=0;
		
		for ( int i = 1; i <= 10; i++) {
		
			if(i%2 == 0)
			{
				cnt = cnt + i;
				
			
			}
			else 
			{
				cnt = cnt +(-i);
			}
		
			
			
	}
		System.out.println(cnt);
 }
}