package test;

import java.util.Scanner;
public class Homework4 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int z = in.nextInt();
		for(int i = 0; i < z; i++) {
	
			int y = in.nextInt();
			String S = in.next();	
			
			for(int j = 0; j < S.length(); j++) {           
				for(int k = 0; k < y; k++) {	
					System.out.print(S.charAt(j));
				}
			}
            
			System.out.println();
		}
	}
}