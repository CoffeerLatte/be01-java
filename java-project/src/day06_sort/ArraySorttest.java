package day06_sort;

import java.util.Arrays;

public class ArraySorttest {
	public static void main(String[] args) {
		

	int[] a = {1,3,2,5,7};
	int temp;	
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		
		
		
		System.out.println("오름차순");

		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		for (int i = a.length-1; i >=0; i++) {
			System.out.print(a[i]+"\t");
		}
		
		
	}
}
