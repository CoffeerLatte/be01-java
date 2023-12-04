package day10_API.string;
class Point{
	
}
public class MainEntry {

	
		public static void main(String[] args) {
			
			String str = "abc";
			  char data[] = {'a', 'b', 'c','d'};
			     str = new String(data);
			     
			     
			     System.out.println(str);
			     System.out.println(data);
			     
			     
			     
			     char ch = str.charAt(0);
			     System.out.println(ch);
			     System.out.println(str.charAt(2));

			     
			     String msg = "asdasdadQWEQEDASDADQWewqesadqwe";
			     
			     System.out.println("korea"+msg);
			     
			     System.out.println(msg);
			     
			     String str2  = "abcde".substring(2);
			     
			     System.out.println(str2);
			     
			     str2 = "abcdefghijklmnop".substring(0, 6);
			     System.out.println(str2);
			     
			     
			     
			     System.out.println(msg+","+str2);
			     
			     
			     String s1 = new String("encore");
			     String s2 = new String("encore");
			     
			     
			     System.out.println(s1.hashCode()+", "+s2.hashCode());		// 서로 해쉬 코드가 같음.		글자가 같으면 서로 같은 해쉬코드를 갖음.
			     
			     
			     Point p1 = new Point();
			     Point p2 = new Point();
			     System.out.println(p1.hashCode()+","+p2.hashCode());		// 서로 해쉬코드가 다름.
			     
			     
			     String s3 = "seoul";
			     String s4 = "seoul";
			     System.out.println("=================");
			     if (s3 == s4 )
			     {
			    	 System.out.println("same");
			     }
			     else System.out.println("not same");
			     System.out.println("=================");
			     
			     
			     
			     if (s1 == s2 )				// == 은 stack 영역의 데이터 값에 대한 질의  heap 영역은 equals
			     {
			    	 System.out.println("same");
			     }
			     else System.out.println("not same");
			     System.out.println("=================");
			     System.out.println(s1.hashCode()+", "+s2.hashCode());
			     
			     s2 = "kosa";
			     
			     
			     System.out.println(s1.hashCode()+", "+s2.hashCode());
			     
			     
			     s2 = "korea";
			     
			     System.out.println(s1.hashCode()+", "+s2.hashCode());
			     
			     s2 = "encore";
			     
			     System.out.println(s1.hashCode()+", "+s2.hashCode());
			     
			     
			     
		}
}
