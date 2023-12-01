package day10_API.wrapper;


class Point
{
	
}



public class MainEntry {

	public static void main(String[] args) {
			
		
		Integer Ia = new Integer(9);
		Integer Ib = new Integer("9");
		
		String su = "30";
		
		int x = 10;
		
		
		Point pt = new Point();
		
		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(pt.hashCode());

		System.out.println(Ia);
		System.out.println(Ia.toString());
		System.out.println(Ia.hashCode());
		System.out.println(Ia.getClass().getName()+"@"+Integer.toHexString(Ia.hashCode()));
		
		
		// Boxing  vs Unboxing
	
		
		
		int y =5;
		
		double t = 3.3;
		
		t = y;	// 묵시적 형변환
		
		y = (int)t;  // -> 명시적 형변환
		
		int c = Ia.intValue();		//heap 영역의 데이터를 stack으로
		
		int e = Ib;			// jdk 5.x로 와서는 자동으로 x.intvalue();를 사용하지 않아도 형변환된다.
		
		
		int num = Integer.parseInt(su);
		
		
		
		System.out.println(c+num);
		System.out.println(c + e);
		System.out.println(Ia.MAX_VALUE);
		System.out.println(Ia.MIN_VALUE);
		
		Double dd = new Double(12.34);
		
		System.out.println("--------------------");
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		
		c= (int)dd.doubleValue();
		System.out.println("형변환환 c의 값은? "+ c);
		System.out.println("===========================");
		int f = Integer.parseInt("123");
		int g = Integer.parseInt("1111", 2);
		System.out.println(f);
		System.out.println(g);
		
		
		
		
		int h = 3;	// stack 영역에 저장
		Integer i = new Integer(3);	// heap 영역에 저장
		
		
		
		
		
		
		
		
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toBinaryString(10));
	}
}
