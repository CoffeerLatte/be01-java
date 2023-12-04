package day11_collection.set;

import java.util.TreeSet;

public class TreeSetEx01 {
		public static void main(String[] args) {
			
		TreeSet set = new TreeSet();
		
		int[] score = {1,54,34,56,42,45,43,87,99};
		
		for (int i = 0; i < score.length; i++) {
			
			set.add(new Integer(score[i]));
			
		//
			set.add(score[i]);
		}
		System.out.println(set);			// 자동 정렬
		
		System.out.println("50보다 작은 값은: "+set.headSet(new Integer(50))+"\n"+"60보다 큰 값은: "+set.tailSet(60));
		System.out.println("제일 작은 값: "+set.first());
		System.out.println("제일 큰 값: "+set.last());
		
		}
}
