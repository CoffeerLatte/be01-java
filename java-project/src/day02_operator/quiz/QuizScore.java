package day02_operator.quiz;


import java.util.Scanner;



public class QuizScore {
	public static void main(String[] args)
	
	
	
	{
		
		
		Scanner scan = new Scanner(System.in);
		 
		 
		
		int kor, Eng, Cal;
		int sum;
		double avg;
		System.out.print("국어 점수는 ?: ");
		kor = scan.nextInt();
		System.out.print("영어 점수는 ?: ");
		Eng = scan.nextInt();
		System.out.print("통계 점수는 ?: ");
		Cal = scan.nextInt();
		
		sum = kor + Eng + Cal;
		avg = ((double)sum)/3;
		
		
		System.out.printf("합= %d \n평= %.2f \n" ,sum, avg);
		
		
	}
}






/*
 * package day02_operator.quiz;
 * 
 * //import java.lang.*; import java.lang.String; import java.lang.System;
 * 
 * 
 * 
 * public class QuizScore { public static void main(String[] args)
 * 
 * 
 * 
 * {
 * 
 * int kor= 90, Eng = 88, Cal = 100; int sum; double avg;
 * 
 * sum = kor + Eng + Cal; avg = ((double)sum)/3;
 * 
 * System.out.printf("합= %d \n평= %.2f \n" ,sum, avg);
 * 
 * 
 * } }
 */
