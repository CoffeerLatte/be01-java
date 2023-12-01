package day10_API.object;
class circle{
	int x,y;
}
public class EqualsMain {
	
	public static void main(String[] args) {
		circle c1= new circle();
		circle c2= new circle();
		
		
		
		if(c1 == c2) {
			System.out.println("same");
			
		
	}
		else {
			System.out.println("notsame");
		}
		System.out.println(c1.hashCode()+","+c2.hashCode());
		
		int x= 3, y =3;
		System.out.println("기본 자료형 비교");
		if(x==y)
		{
			System.out.println("same");
		
	}
		else System.out.println("not same");

			String s1 = new String ("korea");
			String s2 = new String ("korea");
			
			
			
			System.out.println("참조 자료형 비교");
			if(s1 == s2)
			{
				System.out.println("same");
			}
			else System.out.println("not same");
			
			
			System.out.println("=========equals method=========");
			
			if(s1.equalsIgnoreCase(s2)) System.out.println("same!!");
			else	System.out.println("not same!!");
			
			if(s1.equals(s2)) System.out.println("same!!");
			else	System.out.println("not same!!");
			
			
			
			
			
			
			
			
			
			
			
}
}
