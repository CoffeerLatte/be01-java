package ex01.operator;


public class MainEntry {
	public static void main(String[] args) {
	
		//shift 연산자  : >> << >>>
		
		int x = 8 ,result;
		result = x <<2 ; //left shift
		result = x >> 3;
		System.out.println(result);
			// 계산하는 방법 : 원래값 * 2 ^bit수    ^ = 지수승
		
		
			// right shift  : 원래값 /2 ^ bit수   ^ = 지수승
		System.out.print(result);
	}
}

































//public class MainEntry {
//	public static void main(String[] args) {
//	
//		// 산술연산자 : +, -, *, /, % ...
//		// %는의 나누고 나머지를 출력해줌.
//		// 정수의 연산은 정수다. 어떤 연산과 같이해도 정수와 연산하면 정수가 출력된다.
//		
//		int x = 10, y = 20;
//		int gob = x * y;
//		System.out.println("x*y ="+ gob);
//		System.out.println("x*y =" + (x*y));
//		System.out.println(x + "* " + y + "=" + gob);
//		System.out.println("\n\n3+4*5 = "+ (3+4*5));
//		System.out.println("(3+4)*5 = " +  ((3+4)*5));
//		
//		
//		// 정수 ( +, - ,* , /,% ...)
//		System.out.println("\n7 / 3="+ (7/3.));
//		System.out.println("7%3="+ (7%3));
//		
//		System.out.println("\n 7 / 3.0="+ (7/3.));
//				System.out.println("7.0 % 3.0 ="+ (7. % 3.));
//		
//		
//		
//		
//		
//	}
// }

















//public class MainEntry {
//	public static void main(String[] args) {
//	int x =-7 ,y;
//	y= ~x; // 비트부정 = 비트값을 반전시킴.  = -(원래값 +1)
//	System.out.print(y);
//	
//		
//	}
//}




//public class MainEntry {
//	public static void main(String[] args) {
//		// 단항 연산자 : 증감 연산자 ++. --, ~ , .... 
//		//ex)
//		int x = 10, y;
//		y = x++; // 뒤에 연산자가 붙었다는 후위 연산: 대입을 먼저하고, 연산은 나중에 한다.
////	y = ++x; //  전위 연산 : 연산을 먼저하고 대입을 나중에 한다.
////	 x++ ++x 와 같이 단독으로 쓰일 때는 상관없이 그냥 증가한 값이다.
//		System.out.print("x="+ x + ", y = " + y);
//		System.out.print("x="+ x + ", y = " + y);
//		
//		
//	}
//}
