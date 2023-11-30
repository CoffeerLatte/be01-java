package day09_Abstract.ex02;

public class Triangle extends Shape{


	@Override
	public double calc(double x, int y) {
		
		result = (x * y) /2;
		
		
		return result;
	}
	
	
	
	@Override
	public void show(String name) {
		
		calc(6.2 , 8);
		
		System.out.println(result +"\n" +"높이와 길이의" +" " +name + "이 그려졌습니다.");
		
	}

	

}
