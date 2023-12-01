package day10_API.object;
class Rectangle{
	
	int x, y;
	
	public void display() {
		System.out.println(x+", "+y);
	}
	
//	public String toString() {
//		String str = x+", "+y;
//		return str;
//	}
	
	@Override
	public String toString() {
		return "ToStringMain [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
public class ToStringMain {
	
	public static void main(String[] args) {
		
		
		Rectangle  rt = new Rectangle();
		
		rt.display();
		
		System.out.println(rt);
		
		
	}

	
}
	
