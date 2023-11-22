package day03_Control.For;
import java.util.*;
public class QuizEx01 {

	
	public static void main(String[] args) {
		System.out.println("1~100 중에 3의 배수들의 합과 개수는? : ");
	
		int sum=0, cnt=0;
		
		for( int i =1 ; i <= 100; i++)
			
		{
			if(i%3 == 0)
			{
				sum = sum + i;
				cnt = cnt +1;
			}
			
		}
		
		System.out.println("개수"+cnt+" "+"합"+sum);
		
	}
}





























/*
 * System.out.println("몇단을 출력할까요? : "); int sc; sc = new
 * Scanner(System.in).nextInt();
 * 
 * 
 * 
 * for (int i=1; i<=10; i ++) { System.out.println((sc*i));
 * 
 * }
 */