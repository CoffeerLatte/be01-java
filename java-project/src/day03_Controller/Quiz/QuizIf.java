package day03_Controller.Quiz;

import java.util.Scanner;

public class QuizIf {
	public static void main(String[] args) {
	
		
		// 두 수를 입력받아서 큰 수를 출력: 정수만
		
		int num1, num2;
		System.out.print("수를 입력하세요");
		
		num1 = new Scanner(System.in).nextInt();
		num2 = new Scanner(System.in).nextInt();
		
		
		if (num1 > num2 )
		{
			System.out.print(num1+"이 더 큽니다.");
			
		}
		else {
			System.out.print(num2+"이 더 큽니다.");
		}
		
}
}
