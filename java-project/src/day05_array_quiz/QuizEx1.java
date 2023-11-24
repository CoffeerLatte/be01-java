package day05_array_quiz;

public class QuizEx1 {

	public static void main(String[] args) {
		
		// su 라는 게 있다. 이 배열안에서 7이 몇개인가.
		
		int[] su = {1,7,4,7,55,90,10,77,2,7,23};
		
		int cnt=0;
		
		for (int i = 0; i < su.length; i++) {
			
			if(su[i] == 7 )
			{
				cnt += 1;
			}
			
			
			
			
		}
		
		System.out.println(cnt);
		
	}
	
}
