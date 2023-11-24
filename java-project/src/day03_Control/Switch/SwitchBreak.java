package day03_Control.Switch;
import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
	
			int point = new Scanner(System.in).nextInt();
			
		
		switch (point) {
		case 1:
			System.out.print("\n1등 당첨. 상품: 집");
			///break;
		case 2 :
			System.out.print("\n2등 당첨. 상품: 차");
			//break;
		case 3 :
			System.out.print("\n3등 당첨. 상품: 자전거");
			//break;
		case 4 :
			System.out.print("\n4등 당첨. 상품: 휴지");
		//	break;
		//default:
			//System.out.println("입력 실수");
			//System.exit(1); // 프로그램 강제 종료
			
		}
		System.out.println("당첨 축하.");
	}
}


















































/*
 * System.out.println("도시를 선택하세요 (s, d, b, j)");
 * 
 * 
 * String ch = new Scanner(System.in).nextLine();
 * 
 * switch (ch) { case "s": System.out.print("\nSeoul"); ///break; case "d" :
 * System.out.print("\nDaegu"); //break; case "b" : System.out.print("\nBusan");
 * //break; case "j" : System.out.print("\nJeju"); // break; //default:
 * System.out.println("입력 실수"); System.exit(1); // 프로그램 강제 종료
 * 
 * } System.out.println("을(를) 선택하셨습니다.");
 */