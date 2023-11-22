package day03_Controller.Quiz;

import java.util.Scanner;

public class QuizIf2 {

	public static void main(String[] args) {
		
		int year;
		
		year = new Scanner(System.in).nextInt();
		
		
		if( year % 4 == 0 )
		{
			
			if((year % 100 != 0) || (year % 400 == 0) ) {
				
				System.out.print("당신은 윤년입니다.");
				
			
			}
			
		}
	
		else
		{
			System.out.print("당신은 평년입니다.");
		}
	}
}
