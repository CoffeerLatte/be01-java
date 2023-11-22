package day03_Controller.ex01.If;

import java.util.Scanner;

public class MainEntry {

	public static void main(String[] args) {
		
		//입력 받아서 양수 음수 0 판정
		int num;
		System.out.print("Input data: ");
		num = new Scanner(System.in).nextInt();
		
		
		
		if (num > 0 ) 
		{
			System.out.print("양수");
			
		
		}
		else if(num == 0) {
			System.out.print("0");
			
		}
		else {
			
			System.out.print("음수");
		
		}
		
		
		
		
		
		
		
		
	}
}




/*
 * System.out.print("int data: "); int su = new Scanner(System.in).nextInt();
 * 
 * // 짝수, 홀수 판정
 * 
 * 
 * if (su % 2 == 0) { System.out.print("짝수"); } else { System.out.print("홀수"); }
 */