package day06_method.Quiz;
import java.util.*;
public class QuizEx1 {

		public static void info(String name, int tel, String Address)
		{
			System.out.println("당신의 이름은 "+ name+" 이고, "+ "전화번호는 "+ tel + "주소는 "+Address+"입니다.");
		}
		
		public static void abs(int x)
		{
			if( x< 0)
			{
				System.out.println(-1*x);
			}
		}
		public static void max() {
			
			
			Scanner sc = new Scanner(System.in);
			
			int a=sc.nextInt(),b=sc.nextInt();
			
			if (a>b)
			{
				System.out.println(a);
			}
			else if(a==b){
				System.out.println((a +"는"+ " "+b)+"와"+" 같습니다.");
			}
			else {
				System.out.println(b);
			}
					
			
		}
		
		public static void main(String[] args) {
			
			abs(-65654);
			info("전승민", 231231, "12321321");
			max();
			
			
			
			
			
		}
	
public static void max() {
			
			
			Scanner sc = new Scanner(System.in);
			
			int a=sc.nextInt(),b=sc.nextInt();
			
			if (a>b)
			{
				System.out.println(a);
			}
			else if(a==b){
				System.out.println((a +"는"+ " "+b)+"와"+" 같습니다.");
			}
			else {
				System.out.println(b);
			}
					
			
		}
		
}
