package day09_Interface.ex02;

public class BB implements IDraw {

	

	
	public void show() {
		System.out.println(su);;
	}


@Override
public void draw() {

	System.out.println("BB 클래스에서 인터페이스 IDraw를 오버라이드함.");
	
	System.out.println(su);
	

	
}
}