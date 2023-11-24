package day03_exception.ex01;

import java.util.Scanner;

public class FinallyMain {

	
		public static void main(String[] args) 
			throws Exception{ // 예외처리 위임
				
				
				
			System.out.println("x, y = ");
			int x, y, result = 0;
			
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			
			result = x /y;
			System.out.println(x+"/"+y+"="+result);
			}
		}

