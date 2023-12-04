package day11.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {

	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		list.add(3);
		
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		
		list2.add(200);
		print(list, list2);
		
		list.sort(null);
		Collections.sort(list2);
		print(list,list2);
		
	}

	public static void print(ArrayList list, ArrayList list2) {

		
		System.out.println("list:  "+ list);
		
		System.out.println("list2: "+ list2);
		
		System.out.println();
	}
	
}
