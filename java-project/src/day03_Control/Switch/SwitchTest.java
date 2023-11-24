package day03_Control.Switch;
import java.util.Scanner;


public class SwitchTest {

	
	public static void main(String[] args) {
		
		
		System.out.println("점수를 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		
		int sum = (scan.nextInt() + scan.nextInt()+ scan.nextInt()) ;
		double avg = (double)sum /3;
		char grade;
		
		switch ((int)avg /10) {
		
		case 10:
		case 9:
			grade = 'a'; break;
		case 8:
			grade = 'b'; break;
		case 7:
			grade = 'c'; break;
		case 6:
			grade = 'd'; break;
			
			default :
				grade = 'f';
		}
		
		
	}
}
