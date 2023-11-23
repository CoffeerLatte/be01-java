package day04_control.While;


public class DoWhileGuGu {
	public static void main(String[] args) {

		int a=1, b =1;
		do {
			b=1;
		
		do {
			
			
			System.out.println(a*b);
			b++;
		}
		while(b<=9);
		
		a++;
		System.out.println();
	}
	while(a<10);
}
}
