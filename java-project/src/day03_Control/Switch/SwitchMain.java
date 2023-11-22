package day03_Control.Switch;
import java.util.*;

public class SwitchMain {
	public static void main(String[] args) {
		
		System.out.println("도시를 선택하세요 (s, d, b, j)");
		
		
		String ch = new Scanner(System.in).nextLine();
	//	char ch = new Scanner(System.in).next().charAt(0);
		
		switch (ch) {
		case "s":
			System.out.print("\nSeoul");
			
			break;
		case "d" :
			System.out.print("\nDaegu");
			break;
		case "b" :
			System.out.print("\nBusan");
			break;
		case "j" :
			System.out.print("\nJeju");
			break;
		default:
			System.out.println("입력 실수");
			System.exit(1); // 프로그램 강제 종료
			
		}
		System.out.println("을(를) 선택하셨습니다.");
	}
}


























/*
 * package day03_Control.Switch; import java.util.*;
 * 
 * public class SwitchMain { public static void main(String[] args) {
 * 
 * System.out.println("도시를 선택하세요 (s, d, b, j)");
 * 
 * char ch = new Scanner(System.in).next().charAt(0);
 * 
 * switch (ch) { case 's': System.out.println("Seoul");
 * 
 * break; case 'd' : System.out.println("Daegu"); break; case 'b' :
 * System.out.println("Busan"); break; case 'j' : System.out.println("Jeju");
 * break; default: System.out.println("입력 실수"); System.exit(1); // 프로그램 강제 종료
 * 
 * } System.out.println("을(를) 선택하셨습니다."); } }
 */