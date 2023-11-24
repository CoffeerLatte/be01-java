package day04_control.While;

import java.util.Scanner;
public class WhileInpit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name, str input : ");
		
//		String name = sc.nextLine();	// 공백인식못함. .next() , .nextLine()은 공백을 포함한 한 라인을 인식
//		
//		int su = sc.nextInt();
		int su = sc.nextInt();			//숫자가 먼저 입력을 받으면 동작하지 않음. 문자가 먼저 받아지고 숫자를 받아야 정상동작
										// 이런 것을 화이트 스페이스라고 한다. 숫자가 먼저 입력되어 같이 입력된 스페이스가 문자로 입력되어서 두 번째 입력을 뺏겨버림.
		String name = sc.nextLine();	// 공백인식못함. .next() , .nextLine()은 공백을 포함한 한 라인을 인식
		
		
		
		System.out.println(su+", "+name);
		
	}
	

}
//System.out.println("integer, double, char data input: ");
//int  x =sc.nextInt();
//double y = sc.nextDouble();
//char ch = sc.next().charAt(0);
//System.out.println(x + ","+y+","+ch);