package day03_Control.Switch;

import java.util.Scanner;

public class MainEntry {

	
		public static void main(String[] args) {
			System.out.println("당신의 포인트 점수는?(1~3점) input : ");
			
			int point = new Scanner(System.in).nextInt();
			
			switch(point) {
			
			case 1:	//숫자일땐 그냥, 문자는 ' ', 문자열은 " " 
				System.out.println("당신의 포인트는 1점 입니다.");
				break;
				case 2: System.out.println("당신의 포인트는 2점 입니다.");
				break;
					case 3: System.out.println("당신의 포인트는 3점 입니다.");
					break;
					default : System.out.println("없는 점수 입니다. 1~3까지만 입력");	// 없는 정보에 대한 처리
			} // switch end
		}
}
