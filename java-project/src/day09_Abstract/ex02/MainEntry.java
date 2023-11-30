package day09_Abstract.ex02;

public class MainEntry {

	
		public static void main(String[] args) {
			
			// 1. 각자의 클래스로 객체 생성 형태
			Circle cl = new Circle();
			Rectangle rt = new Rectangle();
			Triangle tr = new Triangle();
			
			cl.show("원");
			rt.show("사각형");
			tr.show("삼각형");
			
			System.out.println("==========================================");
			
			// 2. 부모 클래스로 객체 생성
			
			Shape sp = new Circle();
			
			sp.show("원원원");
			
			sp = new Rectangle();
			
			sp.show("사각사각");
			
			sp = new Triangle();
			
			sp.show("삼각삼각");
			
			
			System.out.println("===========================================");
			
			// 3. 배열을 이용한 객체 생성
			
			
			Shape[] ss = new Shape[3];			// 배열 선언 및 생성
			
			ss[0] = new Circle();
			
			
			ss[1] = new Rectangle();
			
			
			ss[2] = new Triangle();
			
			
			String[] name = {"Circle", "Rect", "Tri"};
			
			
			
			for (int i = 0; i < ss.length; i++) {
				
				ss[i].show(name[i]);
				
				
			}
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
}
