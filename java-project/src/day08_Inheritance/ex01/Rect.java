package day08_Inheritance.ex01;

public class Rect extends Circle {

	
	private int x2,y2;
	
	
	public Rect() {
		x2=y2=200;
		
		System.out.println("default rect constructor");
		
	}
	
	public Rect(int x, int y) {
		
		this.x2 = 300;
		this.y2 = 400;
		
		
		System.out.println(" rect 2 constructor");
		
	}
	
	
	
	
	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	public void dp() {
		new Circle().ds();
		System.out.println(", "+x2+", "+y2);
		
		
	}
	
}
