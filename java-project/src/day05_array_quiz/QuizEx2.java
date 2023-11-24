package day05_array_quiz;

import java.util.Scanner;

public class QuizEx2 {

		public static void main(String[] args) {
			
			//	quiz 2 = 기상청에 합격해서 입사했다. 빗물받이 통이 있다. 8월달 강수량, 4월달 강수량. 현재는 11월...
				// 한달간의 강수량(30일)을 입력 받아서 평균을 구하자. 
			double[] arr = new double[3];
			
			Scanner sc = new Scanner(System.in);
			
			double z=0, avg=0, sum =0;
			
			
			for (int i = 0; i < arr.length; i++) {
				
				
			arr[i] = sc.nextDouble();
			
			z= z + arr[i];
			System.out.println(z);
			
				
				
				
			}
			
			avg = z / 3;
			System.out.printf("강수 평균: %.2fml 입니다.",avg);
			
		}
}
