package day07_InstanceMethod;

// instance method 사용 시 메모리에 할당되어 있어야 함. = 객체를 생성하고 사용해야 함.
class bee{
	
	int x, y;
	
	public void setData(int xx, int yy) {
		
		System.out.println(xx+", "+yy);
	}
	
	
}	//class bee end



public class InstanceMethod {

		public static void main(String[] args) {
			
			bee a = new bee();
			
			a.setData(100,200);
			
			System.out.println(a);
			
		}
}
