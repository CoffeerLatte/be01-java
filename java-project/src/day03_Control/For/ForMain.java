package day03_Control.For;

import java.util.*;

public class ForMain {

		public static void main(String[] args) {
			
		try {
		int one, two;
		String three;
		System.out.println("숫자 2개와 연산자를 입력해주세요.");
		
		one = new Scanner(System.in).nextInt();
		two = new Scanner(System.in).nextInt();
		three = new Scanner(System.in).next();
		
		
		
		switch(three)
		{
		case "*" :
			{
				System.out.print("첫 번째 입력한 값: "+one+" "+"두 번째 입력한 값: "+two+" "+"입력한 연산자는 : "+three+" "+"결과는 :" );
				System.out.println(one*two);
				break;
			}
		case "+" :
		{
			System.out.print("첫 번째 입력한 값: "+one+" "+"두 번째 입력한 값: "+two+" "+"입력한 연산자는 : "+three+" "+"결과는 :" );
			System.out.println(one+two);
			break;
		}
		case "-" :
		{
			System.out.print("첫 번째 입력한 값: "+one+" "+"두 번째 입력한 값: "+two+" "+"입력한 연산자는 : "+three+" "+"결과는 :" );
			System.out.println(one-two);
			break;
		}
		case "/" :
		{
			System.out.print("첫 번째 입력한 값: "+one+" "+"두 번째 입력한 값: "+two+" "+"입력한 연산자는 : "+three+" "+"결과는 : " );
			System.out.println(one/two);
			break;
		}
			
		}
		
		}

		catch (Exception e) {
			System.out.print("Exception ");
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}

		}

}
//switch(j) {
//case 1:
//{
//	System.out.print("*"+"\n");
//	break;
//}
//case 2:
//{
//	System.out.print("**"+"\n");
//	break;
//}
//case 3:
//{
//	System.out.print("***"+"\n");
//	break;
//}
//case 4:
//{
//	System.out.print("****"+"\n");
//	break;
//}
//case 5:
//{
//	System.out.print("*****"+"\n");
//	break;
//}
			


// 별 1번
//package day03_Control.For;

//import java.util.*;
//
//public class ForMain {
//for(int i=1; i <=5; i++)
//{
//	
//	for(int j =1; j <=i; j++)
//	{
//		System.out.print("*");
//	}
//		System.out.println();
//}
//}

//별 2번
// package day03_Control.For;

//import java.util.*;
//
//public class ForMain {
//for(int i=5; i >=1; i--)
//{
//	
//	for(int j =1; j <= i; j++)
//	{
//		System.out.print("*");
//	}
//		System.out.println();
//}
//}
