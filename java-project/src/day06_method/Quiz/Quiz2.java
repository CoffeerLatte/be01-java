package day06_method.Quiz;
import java.util.*;
public class Quiz2 {
	public static void main(String[] args) {
		//사칙연산 함수(+-*/), 2개는 리턴+매개변수, 2개는 리턴 아닌 타입+매개변수가 있을 수도 없을 수도 자유.
		int a,b,c,d,f=0;
		Scanner sc = new Scanner(System.in);
		
		int cal;
		
		
		
		System.out.println("사칙연산 입니다. 1 = +, 2 = -, 3 = *, 4 = /");
		
		while(true) {
		cal = sc.nextInt();	
			
			
		 switch(cal)
		{
		case 1:
		{	
			System.out.println("더하기 모드 2개 입력 해주세요");
			Plus();
			break;
		}
		case 2:
		{
			System.out.println("빼기 모드 2개 입력 해주세요");
			sub();break;
		}
		case 3:
		{
			System.out.println("곱하기 모드 2개 입력 해주세요");
			mul();break;
		}
		case 4:
		{
			System.out.println("나누기 모드 2개 입력 해주세요");
			dir();
		}
		}
		
		 System.out.println("계산을 그만 두시나요? 1을 입력해주세요. 1이 아닌 값을 입력하면 돌아갑니다.");
		 
		 f = sc.nextInt();
		if (f == 1)
		{
			break;						
		}
		else
			System.out.println("사칙연산 입니다. 1 = +, 2 = -, 3 = *, 4 = /");
			continue;
		
		
		}
	}
		public static void Plus() {
			Scanner sc = new Scanner(System.in);
			try {
					int z = sc.nextInt();
					int t = sc.nextInt();
					System.out.println(z+t);
					return;
					
			}	
					catch (Exception e) {
						System.out.println("error");
						
					}
					
	}
		
		
		public static void sub() {
			Scanner sc = new Scanner(System.in);
			
			try {
			int z = sc.nextInt();
			int t = sc.nextInt();
			
			int j = z-t;
			System.out.println(j);
			return ;
			}
			
			catch (Exception e) {
				System.out.println("Unknown Error ");
			}
			
		
			
			
		}
		public static void dir() {
			Scanner sc = new Scanner (System.in);
			
			try {
			int x=0,y=0,z;
			
			x=sc.nextInt();
			y= sc.nextInt();
			z = x/y;
			
			System.out.println(z);
			}
			catch (Exception e) {
				System.out.println("0으로 나눌 수 없습니다. 혹은 잘못된 입력입니다.");
				
			}
			
		}
		public static void mul() {
				Scanner sc = new Scanner (System.in);
			
			try {
			int x=0,y=0,z;
			
			x=sc.nextInt();
			y= sc.nextInt();
			z = x*y;
			
			System.out.println(z);
			}
			catch (Exception e) {
				System.out.println("error");
				
			}
			
		}
			
			
		
}
