package day10_API.stringBuffer;

public class MainEntry {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println("length         /t            cpacity");
		System.out.println(sb.length()+ "   /  "+sb.capacity());
		
		
		sb.append("encore");
		System.out.println(sb.length()+ "   /  "+sb.capacity());
		System.out.println("====================================");
		sb.append("123213213 3213");
		System.out.println(sb.length()+ "   /  "+sb.capacity());
		System.out.println("====================================");
		
		
		
		
		
		
	}
}
