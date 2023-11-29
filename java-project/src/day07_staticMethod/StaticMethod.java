package day07_staticMethod;

public class StaticMethod {

		// static method 객체 생성없이 바로 사용 가능함.
			// objectName.methodName();
		
	
	public static void main(String[] args) {
		A.setData(3, 5);
		
		
		
	A obj = new A();
		obj.x = 9;
		System.out.println(obj.x);
		
		obj.setData(3, 5);
		obj.setData(3, 7);
		
	}
	
	
}


class A{							// Classname.methodName();
	int x, y;
	public static void setData(int xx, int yy)
	{
		System.out.println(xx +" " +yy);
	}
	
	
	
	
	
	
	

	
	
	
	
}