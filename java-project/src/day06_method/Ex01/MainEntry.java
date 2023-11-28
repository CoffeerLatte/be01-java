package day06_method.Ex01;

public class MainEntry {

	public static void line() {	// 함수 정의
		System.out.println("------------------------------------------------");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("main start");
		line();	// 함수 호출
		line();
		line();
		line();
		line();
		line();
		display();
		display();
		
		
		System.out.println("main end");
	}
	
	public static void display() {
		
		System.out.println("Jeon Seung Min");
	}
	
	public static void showname(String name, int age) {
		System.out.println("당신의 이름은 "+ name+" 이고, "+ "나이는 "+ age + "살 이군요.");
	}
	
	
}




