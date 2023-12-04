package day11_collection.set;

import java.util.HashSet;
import java.util.Set;


class person {			//extends Object 생략되어 있다.
	
	String name;
	int age;
	
	public person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	
	
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof person) {
			person temp = (person) obj;
			return name.equals(temp.name) && age == temp.age;
			
		}
		
		
		return false;
	}




	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}




	@Override
	public String toString() {
		return "person [name=" + name + ", age=" + age + "]\n";
	}
	
	
}
public class HashSet3 {

	
		public static void main(String[] args) {
			
			Set set = new HashSet();
			
			
			
			
			set.add(new String("happy"));
			set.add(new String("virus"));
			set.add(new String("happy"));
			
			
			set.add(new Double(12.34));
			set.add(new Double(12.));
			set.add(new Double(12.34));
			
			person ps = new person("전승민", 26);
			
			
			set.add(ps);
			
			set.add(new person("김", 10));
			set.add(new person("김", 10));
			set.add(new person("김", 120));
			set.add(new person("천", 20));
			set.add(new person("수", 90));
				// String 타입의 특수성 때문에 같은 이름인 사람도 나올 수 있다.
			
			System.out.println(set);
			
			
			
//			
//			a a = new a();
//			b b = new b();
//			
//			a bb = new b();
//			
//			
//			System.out.println(b instanceof a);
//			System.out.println(b instanceof b);
//			System.out.println(a instanceof a);
//			System.out.println(a instanceof b);
			
		}
}

//class a{
//	
//String name;
//
//}
//
//class b extends a{
//
//
//}
