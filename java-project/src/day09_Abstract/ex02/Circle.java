package day09_Abstract.ex02;

public class Circle extends Shape {

	@Override
	public double calc(double x, int y) {
		
		
		result = x * x * Math.PI;
		return result;
		
	}
	@Override
	public void show(String name) {
		
		calc(5.5,0);
		System.out.println(result +"\n" +"반지름의" +" " +name + "이 그려졌습니다.");
		
		
	}



}
