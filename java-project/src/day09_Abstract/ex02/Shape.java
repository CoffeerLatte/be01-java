package day09_Abstract.ex02;

public abstract class Shape {

		double result = 0;
		
		public abstract double calc(double x, int y);
		public abstract void show(String name);
		
		
		public void view() {
			
			System.out.println("Super classs Shape 입니다.");
			
		}
}
