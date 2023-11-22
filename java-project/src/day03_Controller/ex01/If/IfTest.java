package day03_Controller.ex01.If;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		//입력 받아서 양수 음수 0 판정
		int num;
		System.out.print("Input data: ");
		num = new Scanner(System.in).nextInt();
		
		
		
		if (num > 0 ) 
		{
			System.out.println("양수");
			if (num % 2 == 0)
			{
				System.out.print("짝수");
				
			}
			else {
				System.out.print("홀수");
			}
		
		}
		else if(num == 0) {
			System.out.println("0");
			
			
		}
		else {
			
			System.out.println("음수");
			if (num % 2 == 0)
			{
				System.out.print("짝수");
				
			}
			else {
				System.out.print("홀수");
			}
		
		}
		
		
		
		
		
		
		
		
	}
}