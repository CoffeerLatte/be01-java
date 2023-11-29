package day08_Inheritance.ex01;

public class Main {

	public static void main(String[] args) {
		new Circle().dp();
		
		System.out.println("-----------------------------");
		new Circle(1,2,3).dp();
		System.out.println("===============================");
		new Rect(1,2).dp();
		System.out.println("===============================");
		
		
	}
}
