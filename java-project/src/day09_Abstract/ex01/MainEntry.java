package day09_Abstract.ex01;

abstract class Shape{			//추장 클래스이며, super class이다.
				
	double result ;
	int results;
	
	
	public abstract double calc();		// 몸체를 갖고 있지 않은 추상 메소드
	public abstract void draw();
	
	public void show() {	// 일반 메소드
		System.out.println("Super class Shape");
	}
	
}//shape end
	
class Circle extends Shape{			//sub class

	double r = 5.0;
	
	
	
	@Override
	public double calc() {
		
		result = (r * r * Math.PI);
		
		return result;
	}

	@Override
	public void draw() {
			System.out.println("원의 넓이는: "+result+"인 원을 그렸습니다.");
	}
	
}
	
class Triangle extends Shape{			//sub class

	double r = 5.0, h = 5;
	
	
	
	@Override
	public double calc() {
		
		result = (r * h) /2;
		
		return  result;
	}

	@Override
	public void draw() {
			System.out.println("삼격형의 넓이는: "+result+"인 삼각형을 그렸습니다.");
	}
	
}
	
class Rectangle extends Shape{			//sub class

	
	
	
	
	@Override
	public double calc() {
		int x= 5, y= 5 ;
		results = x*y;
		
		return  results;
	}

	@Override
	public void draw() {
			System.out.println("사각형의 넓이는: "+results+"인 사각형을 그렸습니다.");
	}
	
}


public class MainEntry {

	
	
	
				public static void main(String[] args) {
					
					//	Shape sp = new Shape();		<- 자체적으로 객체를 생성할 수 없다. 그렇게 때문에 미완성 클래스이다. 하지만 자손 클래스는 객체 생성이 가능하다.
					
					Circle cl = new Circle();
					Triangle tr = new Triangle();
					Rectangle rt = new Rectangle();
					
					
					cl.draw();
					tr.draw();
					rt.draw();
					
					
					
				}
				
				
				
}






















