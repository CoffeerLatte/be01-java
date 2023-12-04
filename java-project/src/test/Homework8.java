package test;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n , m;
		int result=0;
		
		n = sc.nextInt();
		
		m = sc.nextInt();
		
		
		int[] w = new int[n];
		
		for (int i = 0; i < n; i++) {
		
			w[i] = sc.nextInt();
			
			
		}
		
		
		
		
		for (int i = 0; i < n-2; i++) {
			for (int j = i+1; j < n-1; j++) {
				for (int j2 = j+1; j2 < n; j2++) {
					
					
					int temp = w[i] + w[j]+ w[j2];
					
					
					if(m == temp)
					{
						result = temp;
						
					}
					
					
					if(temp < m  && result < temp )
					{
						result = temp;
					}
						
					
				}
			}
		}
		
		System.out.println(result);
		
		
	}
	
	
}



