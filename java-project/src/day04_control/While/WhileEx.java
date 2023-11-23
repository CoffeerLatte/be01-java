package day04_control.While;

import java.util.Scanner;

public class WhileEx {

		public static void main(String[] args) {
			int su;;
			
			
				
			
			while(true) {
			do {
				System.out.print("3과목의 점수를 입력해 주세요 국어, 영어, 전산 순 1~100까지만 : ");
				
				su = new Scanner(System.in).nextInt();
				System.out.println(su);

			}
			while(su <= 0 || su >= 100);
			
			
			System.out.println("점수를 더 입력 받을 것 인지? (y/n)");
			
			char yesno = new Scanner(System.in).next().charAt(0);
			if(yesno == 'n' || yesno == 'N') break;
		}
		}
}
