package day08_Inheritance.ex01;

public class Point {

		
	
	protected int x,y;
	
	
		public Point() {
			
			x=700; y=120;
			System.out.println("You just called default constructor");
		}
		
		
		
		public Point(int x)
		{
			this.x =x;
			System.out.println("Point 1개 constructor call");
		}
		

		
		
		public Point(int x, int y)
		{
			
			this.x =x ;
			this.y = y;
			
			
			System.out.println("Point 2개 constructor call");
		}
		
		public int getX() {
			return x;
		}



		public void setX(int x) {
			this.x = x;
		}



		public int getY() {
			return y;
		}



		public void setY(int y) {
			this.y = y;
		}



		public void ds() {
			System.out.print(x + ", "+ y);
		}
}
