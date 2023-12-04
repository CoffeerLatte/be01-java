package quiz1.collection.list;

import java.util.Vector;

public class MainEntry {

	public static void main(String[] args) {
		Customers cu = new Customers();
		System.out.println(cu);
		
		Customers cu2 = new Customers("전승민","부산", "111-111-1111");
		
		System.out.println(cu2);
		
		Vector<Customers> list = new Vector<Customers>();
		
		list.addElement("전승민");
		
		
		
	}
}
