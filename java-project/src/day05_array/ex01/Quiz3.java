package day05_array.ex01;
import java.util.*;


public class Quiz3 {
//2행 3열 임의의 숫자를 받아서 합을 
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[][] a = new int[2][3];
		int sum= 0;
	
				for(int i=0; i < 2 ; i++)
				{
					
					for (int j = 0; j < 3; j++) {
						
						
						
						a[i][j]= sc.nextInt();
						sum += a[i][j];
					}
				}
//				System.out.println(sum);
	}
}
