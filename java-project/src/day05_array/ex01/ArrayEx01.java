package day05_array.ex01;

import java.util.Scanner;

public class ArrayEx01 {
	public static void main(String[] args) {
		
	// 임의적 데이터를 입력 받아서 출력하기
		int[] i= new int[5];
		
		Scanner z = new Scanner(System.in);
			
	
		
		for (int j = 0; j < i.length; j++) {
			
			i[j]= z.nextInt();
			
		}
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	
	}
}
