package day03_Control.For;


public class QuizEx02 {
	public static void main(String[] args) {
		
		
		int i, sum=0;
		
		for (i=1; i<=100; i ++)
		{
			sum += i;
		}
		
		System.out.println("1부터 100까지 합은: "+sum);
	}
}
