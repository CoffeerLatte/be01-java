package day08_defaultConstructor;


//	default  constructor & api

public class MainEntry {
	
	/**
	 * 
	 * @param args	메인은 아무 값도 넘겨 받지 않는다.
	 * @author Playdata
	 * // @param x 곱을 구하는 것에 첫 번째 정수형 변수다.
	 * // @param y 곱을 구하는 것에 두 번째 정수형 변수다.
	 * //@param gob 변수는 x와 y의 두 정수의 곱을 저장한 변수이다.
	 */
	
		public static void main(String[] args) {
			
			int x,y,gob =1;
			
			char ch = 'A';
			
			String msg;
			
			
			x= 5; y = 10;
			
			
			msg = "Hello Encore!";
					
					gob = gob(x,y);
					
			System.out.println(ch);
			System.out.println(msg);
			System.out.println(x+" "+y+" =  "+gob);
			
		}

	private static int gob(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}
}
