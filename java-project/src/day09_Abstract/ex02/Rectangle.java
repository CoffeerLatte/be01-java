package day09_Abstract.ex02;

public class Rectangle extends Shape{

	


	@Override
	public double calc(double x, int y) {
		
		result = x * y;
		
		
		return result;
	}
	@Override
	public void show(String name) {
		
		calc(7,9);
		
		System.out.println(result +"\n" +"길이 x와 y의" +" " +name + "이 그려졌습니다.");
		
	}

}
