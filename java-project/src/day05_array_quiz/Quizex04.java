package day05_array_quiz;
import java.util.*;
public class Quizex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] a = new int[3][4];
		
		int sum = 0, b= 0, c= 0;
		
		
		for (int i = 0; i < a.length; i++) {
			 
			for (int j = 0; j < a[i].length; j++) {
				
				
				if(i==2)
				{
				a[2][j] = a[0][j] + a[1][j];
			//	System.out.print(a[i][j]+"\t");
				
				}
				else
				{
					System.out.print(i+1);
					a[i][j] = sc.nextInt();
				//	System.out.print(a[i][j]+"\t");
				
				}
			
			
		}
		//	System.out.print(a[i][j]+ "\t");
		
		
		
		
		
	}
		
		for (int i = 0; i < a.length; i++) {
			 
			for (int j = 0; j < a[i].length; j++) {
				
				System.out.print(a[i][j]+"\t");
				
			
			
		}
		
		System.out.println();
}
	}}
