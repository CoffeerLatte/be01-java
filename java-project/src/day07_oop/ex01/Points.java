package day07_oop.ex01;

public class Points {

		private int x,y;
		
		public void SetX (int xx)
		{
			x = xx;
		}
		
		public int GetX()
		{
			return x ;
		}
		
		public void SetY ( int yy)
		{
			y =yy;
			
		}
		public int GetY ()
		{
			return y;
		}
		
		public void Display() {
			System.out.println(x+", "+y);
		}
}

