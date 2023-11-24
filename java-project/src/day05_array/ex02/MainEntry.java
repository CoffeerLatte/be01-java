package day05_array.ex02;
import java.util.*;

public class MainEntry {

	
		public static void main(String[] args) {
			
			
			int[][] a = new int [][]{ {1,2,3},{2,3,4},{3,4,5} };
			
			
			
			System.out.println("행길이 : "+a.length);
			System.out.println("열길이 : "+a[0].length);
			System.out.println("열길이 : "+a[1].length);
			
			
			
			
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.println(a[i][j]);
				}// for i end
				System.out.println();
			}// for j end
		}
}












//package day05_array.ex02;
//import java.util.*;
//
//public class MainEntry {
//
//	
//		public static void main(String[] args) {
//			
//			
//			int[][] a = new int [][]{ {1,2,3},{2,3,4},{3,4,5} };
//			for (int i = 0; i < 2; i++) {
//				for (int j = 0; j < 3; j++) {
//					System.out.println(a[i][j]);
//				}// for i end
//				System.out.println();
//			}// for j end
//		}
//}