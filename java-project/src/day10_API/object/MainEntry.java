package day10_API.object;


class Point{
	
}




public class MainEntry {
public static void main(String[] args) {
	
	Point pt  = new Point();
	System.out.println("Point pt information");
	System.out.println("Class name: "+ pt.getClass());
	System.out.println("hash code: "+ pt.hashCode());	// 1408652377
	System.out.println("Object String: "+ pt.toString());
	System.out.println("Object String: "+ pt);
	System.out.printf("10진수 %d\n", 0x53f65459);
	System.out.println("==================================================");
	
	
	Point pt2  = new Point();
	System.out.println("Point pt information");
	System.out.println("Class name: "+ pt2.getClass());
	System.out.println("hash code: "+ pt2.hashCode());	// 924477420
	System.out.println("Object String: "+ pt2.toString());
	System.out.println("Object String: "+ pt2);
	System.out.printf("10진수 %d\n", 0x371a67ec);
	System.out.println("==================================================");

	System.out.println("pt.toString(): toString()의 의미 - day10_API.object.Point@371a67ec");
	System.out.println(pt2.getClass().getName()+"@"+Integer.toHexString(pt2.hashCode()));

	Point pt3 =new Point();
	
	if(pt.hashCode() == pt3.hashCode())
	{
		System.out.println("pt & pt3 's hashcodes are same");
	}
	else
	{
		
		System.out.println("hashcodes no match");
		
	}
	
	Point pt4;
	pt4 = pt;
	
	if(pt.hashCode() == pt4.hashCode())
	{
		System.out.println("pt & pt4 's hashcodes are same");
	}
	else
	{
		
		System.out.println("hashcodes no match");
		
	}
	
	
}
}
