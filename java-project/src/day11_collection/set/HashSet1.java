package day11_collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	
		public static void main(String[] args) {
			
			
				HashSet<String> hs = new HashSet<String>();
				
				hs.add("마우스"); 
				hs.add("텀블러");
				hs.add("안경");
				hs.add("핸드폰");
				hs.add("마우스");
				
				System.out.println("요소의 개수: "+ hs.size());
				
				
				Iterator it = hs.iterator();
				
				while(it.hasNext()) {	//다음 요소가 있다면
					System.out.println(it.next());		// 중복을 허용하지 않으며, 순서도 존재하지 않는다.
				}
				
				
			//	HashSet<int> hs1  = new HashSet<int>();			// primitive 타입 int는 사용할 수 없다.
				
				HashSet<Integer> hs1  = new HashSet<Integer>();		// <>안에는 객체 형태의 데이터만 설정할 수 있다.
				
				hs1.add(1);
				hs1.add(2);
				hs1.add(3);
				hs1.add(4);
				hs1.add(5);
				
				System.out.println("=======================");
				
				
				for(Integer item:hs1) {
					
					System.out.println(item);
				}
				
				System.out.println("=======================");
				
				for(String item:hs)
				{
					System.out.println(item);
				}
				
				
				System.out.println("=====================");
			Iterator	it1 = hs1.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
				
		}
}
