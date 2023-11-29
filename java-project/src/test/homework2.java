package test;
import java.util.*;

public class homework2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int fir,sec,sum,cnt;
		
		
			fir = sc.nextInt();
			sec = sc.nextInt();
			int[][] a= new int[fir][sec];
			int[][] b = new int[fir][sec];
		
		
		
		
		for ( int i= 0; i < fir; i++) {
			
			for (int j = 0; j < sec; j++) {
				
			a[i][j] = sc.nextInt();

				
			}
		
				} // for end
		
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = sc.nextInt();
						
			}
		}	//for end
		
		
		
		for (int i = 0; i < fir; i++) {
			for (int j = 0; j < sec; j++) {
				
			
				
				
				System.out.print(a[i][j]+b[i][j]);
				if(sec-1 == j)
				{
					System.out.println();
				}
				else
				System.out.print(" ");
				
			}
			
			
		}
						
	}
		
		
		
}

