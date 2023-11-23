// 과제 4: 3개 정수를 입력 받아서 큰 순으로 출력
package day04_homework;

import java.util.*;

public class QuizEx04 {

	
		public static void main(String[] args) {
			
			
			
			Scanner sc = new Scanner(System.in);
			
			int a,b,c;
			
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();
			
			if ((a>b && b>c))
			{
				System.out.println(a+" "+b+" "+c);
			}
			else if (b>a && a>c)
			{
				System.out.println(b+" "+a+" "+c);
			}
			else if (c>a&& a>b)
				{
				System.out.println(c+" "+a+" "+b);
				}
			else if ((a>b && c>b))
			{
				System.out.println(a+" "+c+" "+b);
			}
			else if ((b>a && c>a))
			{
				System.out.println(b+" "+c+" "+a);
			}
			
			else if (c>a&& b>a)
			{
			System.out.println(c+" "+b+" "+a);
		
			
			
			
			
		}
}
}
