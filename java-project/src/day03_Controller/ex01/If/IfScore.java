package day03_Controller.ex01.If;
import java.util.*;

public class IfScore {

	
	public static void main(String[] args) {
		
		int sc1,sc2,sc3,sum,avg;
		System.out.print("점수를 알려주세요.");
		
		
		sc1 = new Scanner(System.in).nextInt();
		sc2 = new Scanner(System.in).nextInt();
		sc3 = new Scanner(System.in).nextInt();
		
		
		System.out.print("점수를 알려주세요.");
	
		sum = sc1 + sc2 + sc3;
		avg = (sum /3)*10;
		
		
		if( avg >= 100)
		{
			System.out.println("A");
		}
		else if(avg > 9)
		{
			System.out.println("B");
			
		}
		else if(avg > 8)
		{
			System.out.println("C");
			
		}
		
	}
}
