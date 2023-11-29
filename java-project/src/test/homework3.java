package test;
import java.util.*;
public class homework3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x;
		String y;
		
		int[][] a = new int[2][3];
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				
				x = sc.nextInt();
				y = sc.next();
				
				System.out.print(x+", "+y);
				
				
			}
			System.out.println();
		}
		
		
		
		
	}
	
}
