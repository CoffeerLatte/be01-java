package day03_exception.ex01;


import java.util.Scanner;



public class MainEntry {
public static void main(String[] args) {
	
	
	int x , y, result = 0;
	// 예외발생

	
	try {
		
		x = new Scanner(System.in).nextInt();
		y = new Scanner(System.in).nextInt();
		
		result = x / y;
	}
		catch(Exception e)
	{
			System.out.println("0으로 나눌 수 없다.");
			System.out.println(e.getMessage());
			e.printStackTrace(); //
			
			
	}
	
	System.out.print(result);
	
	
}

}
























//public class MainEntry {
//
//	public static void main(String[] args) {
//		
//		
//		int x = 30, y = 0;
//		
////		int result = x / y;		// 예외발생
//		int result = 0;
//		
//		if (y == 0 )
//		{
//			System.out.print("0으로 나눌 수 없다.");
//			return;
//		}
//		else {
//			result = x / y;
//		}
//		System.out.print(result);
//		
//		
//	}
//	
//}




/*

예외처리란.... 노트 참고


*/