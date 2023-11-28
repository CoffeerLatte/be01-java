package day06_method.overload;

public class OverloadMain {

	
	public static void line() {
		System.out.println("----------------------------");
	}
	
	
	public static void line(String str) {
		
		for (int i = 0; i < 15; i++) {
			System.out.println(str);
			
			
		}
		
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		while(true)
		line("$#%$%#$%$##%$%#$______+++++++++++=============&$&$^%^%");
	}
	
	
}
