package day07_oop.ex01;

class point{
	private int x,y; // 접근 지정자가 default // 멤버 변수
	
	
	// 멤버 함수
	public void setX(int xx) { x =xx;}
	public void setY(int yy) { y =yy;}
	public int getX() { return x;}
	public int getY() { return y;}
	public void display() {
		System.out.println(getX()+", "+getY());
	}
	
}


class circle{
	
	private int  x,y,r;
	
	public void setX(int x1)  {
			x = x1;
	}
	public void setY(int y1)  {
	y = y1;
}
	public void setR(int r1)  {
		r = r1;
	}
	
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getR() {
		return r;
	}
	
	public void display() {
		
		System.out.println(getX()+", "+getY()+", "+getR());
	}
	
	
	
	
	
	
	
}


public class MainEntry {
public static void main(String[] args) {
//	point pt = new point();
//	
//	System.out.println(pt.getX()+",  "+pt.getY());
//	
//	pt.setX(50);
//	pt.setY(100);
//	
//	System.out.println(pt.getX()+", "+pt.getY());
//	
//	
//	pt.display();
//	
//	circle cl = new circle();
//	
//	cl.display();
//	
////	pt.x = 3;
////	pt.y = 5;
////	
////	System.out.println(pt.x + "," + pt.y);
}
}
