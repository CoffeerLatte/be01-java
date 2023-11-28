package test;

import java.util.Scanner;

public class Home {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,m,f=0,k;
		n = sc.nextInt();
		int[] a = new int[n];
		
		
		
		for (int i = 0; i < a.length; i++) {
			
			m = sc.nextInt();
			System.out.println("어떤 값을 받으실까요?");
		if(m == a[n])
		{
			f++;
		}
			
			
			
		}
		
	
		System.out.println(f);
		
	}
}
