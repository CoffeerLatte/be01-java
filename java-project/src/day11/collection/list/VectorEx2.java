package day11.collection.list;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class VectorEx2 {

		public static void main(String[] args) {
			
			int i;
			
			Date date = new Date();
			
			Vector v= new Vector(3,5);
			
			v.addElement("자바");
			
			v.addElement(new Double(12.34));
			v.addElement(date);
			
			System.out.println("3개 객체 추가 ---------------");
			
			System.out.println("size : "+ v.size()+", capacity: "+ v.capacity());
			
			
			for (int j = 0; j < 10; j++) {
				
				v.addElement(new Integer(j));
				
				
			}
			
			System.out.println("--------10개 객체 추가 ============");
			
			System.out.println("size : "+ v.size()+", capacity: "+ v.capacity());
			
			
			System.out.println("------------------vector 내용 출력----------------");
			
			
			Enumeration enu = v.elements();
			while(enu.hasMoreElements()) {
				System.out.print
				(enu.nextElement()+"\t");
			}
			
			
			System.out.println("\n\n ---------------객체 내용 포함 확인 --------------------");
			
			if(v.contains("자바"))
			{
				System.out.println("자바 문자열이 포함됨.");
				
				
			}
			else System.out.println("자바 문자열이 없음.");
			
			
			System.out.println("12.34 객체 위치는?: "+v.indexOf(new Double(12.34)));
			System.out.println("입력 시간은?:" + date);
			
			
			System.out.println(v.get(v.indexOf(date)));
			
			enu = v.elements();
			
			while(enu.hasMoreElements()) {
				
				System.out.println(enu.nextElement() + "\t");
			}
			
			System.out.println("##############################################");
			
			for (int j = 0; j < v.size(); j++) {
				
				v.removeElementAt(j);
				
			}
			
			System.out.println("size: "+ v.size()+" capacity: "+v.capacity());
			
			System.out.println("\n \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\삭제 후 남은 데이터 \\\\\\\\\\\\\\\\\\");
			
			
			
				for (int j = 0; j < v.size(); j++) {
				
				System.out.println(v.get(j));
				
				
					}
			
			
				
				System.out.println("---------------------------------");
			
				v.removeAllElements();
				
				System.out.println("size: "+ v.size()+" capacity: "+v.capacity());
				
				System.out.println("용량 조절");
			
				v.trimToSize();
				System.out.println("size: "+ v.size()+" capacity: "+v.capacity());
			
			
			
			
			
			
			
			
			
			
			
		}
}
