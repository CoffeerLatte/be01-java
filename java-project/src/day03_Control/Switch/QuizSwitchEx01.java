package day03_Control.Switch;

import java.util.*;

public class QuizSwitchEx01 {

	public static void main(String[] args) {
		
		//숫자 입력 받아서 짝수 홀수
		
		
		int x = new Scanner(System.in).nextInt();
		
		switch(x%2)
		{
			case 0 :
			{
				System.out.println("짝수");
				break;
			}
			default :
			System.out.println("홀수");
		}
		
		
	}
}
