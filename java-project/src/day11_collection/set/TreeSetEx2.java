package day11_collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {
		public static void main(String[] args) {
			
			
			TreeSet set = new TreeSet();
			
			String from = "a";
			String to = "d";
			
			set.add("abc");
			set.add("alien");
			set.add("bat");
			set.add("car");
			set.add("Car");
			set.add("dZZZZZZ");
			set.add("dzzzzz");
			set.add("flower");
			set.add("elephant");
			set.add("elevator");
			set.add("fan");
			
			System.out.println(set);
			System.out.println("range search : from "+ from+" to "+ to);
			System.out.println("result: " + set.subSet(from, to));		// 앞에꺼는 포함 뒤에꺼는 미포함.
			System.out.println("result: "+ set.subSet(from,to+"zzz"));
		}
}
