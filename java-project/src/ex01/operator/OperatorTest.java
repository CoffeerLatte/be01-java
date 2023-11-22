package ex01.operator;

public class OperatorTest {

	public static void main(String [] args)
	{
		//대입 ( 배정 ) 연산자 : = , +=, -=, *=, /=, >>= , <<=, %=........
		
		
		int x = 3, y = 5, result;
		
		result = x + y;
		
		System.out.println(result);
		
		// x = x+y; -> x += y(운영체제마다 다른 수식 결과에 따라서 공통적으로 사용가능한 수식)
		// 처리 속도가 2배 이상 빠르다.
		
		x = x + y;
		x += y;
		System.out.println("x= "+ x + "y= " + y);
		
		
		x = x * y;
		x *= y;
		
		x = x +1;
		x += 1;
		
		x ++;
             		
		// 모두 같은 값이다.
		
		
		
	}
}










































/*
 * //삼항(조건) 연산자: (조건) ? 참 : 거짓 ;
 * 
 * 
 * int x =20, y= 10;
 * 
 * String msg = null; // msg=""; <- null과 같음.
 * 
 * 
 * msg = (x != y) ? "not same" : "same" ;
 * 
 * System.out.println(msg);
 * 
 * int a = 10, b = 20, c = 30, result;
 * 
 * result = ( a > b) ? a : (b>c) ? b:c; //if 문처럼 조건 연산자의 거짓부분에 중첩하여 사용할 수 있다.
 * 
 * System.out.print(result);
 * 
 * 
 * 
 * result = ( a> b ) ? a : (b < c ) ? b : c;
 */