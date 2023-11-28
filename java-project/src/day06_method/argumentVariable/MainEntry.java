package day06_method.argumentVariable;

public class MainEntry {

//	public static void plus (int x, int y)
//	{
//		
//	}
//	public static void plus (int y, int z)
//	{
//		
//	}public static void plus (int x, int y, int z)
//	{
//		
//	}public static void plus (int x, int y)
//	{
//		
//	}public static void plus (int x, int y,int a, int b, int c)
//	{
//		
//	}
	
	public static void  plus(int...x)
	{
		int sum= 0;
		for (int i = 0; i < x.length; i++) {
			 sum += x[i];
			 
		}
		System.out.println(x);
	}
	public static void main(String[] args) {
		plus(1,2);
		plus(1,3,4,4,4,4,4,4,44,4);
	}
}
