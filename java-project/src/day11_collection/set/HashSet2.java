package day11_collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSet2 {

	
		public static void main(String[] args) {
			
			Object[] objArr = {"1",  new Integer(1),"2","3","4","4","4"};		//  1 과 new interger(1)은 같은 1이지만 type이 다르기 때문에 출력되고
																				// 중복되는 값에 대해서는 나오지 않는다.
			
			Set set = new HashSet();
			for (int i = 0; i < objArr.length; i++) {
				set.add(objArr[i]);
			}
			
			System.out.println(set);
		}
}
