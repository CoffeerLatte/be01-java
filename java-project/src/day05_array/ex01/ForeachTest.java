package day05_array.ex01;

public class ForeachTest {

	
		public static void main(String[] args) {
			
			int[] arr = {1,2,3,4,5};
			
			for (int j = 0; j < arr.length; j++) {
				
				System.out.println(arr[j]);
				
			}
			System.out.println("=============================");
			
			int x= 1;
			
			for (int item : arr)
			{	if (x>3)
					{
						System.out.println(arr[2]+"마지막");
						break;
					}
			
				System.out.println(item);
				x++;
			}
			
			System.out.println("=================");
			
			
			// 반 전체 성적
			int y=0;
			int[] score = {78,56,45,88,100};
			
			for (int item : score)
			{
				y += item;
				
				System.out.println(item);
			}
			System.out.println(y);
		}
}












//for(자료형 변수명 : 컬렉션명 or 배열명){
		// 	반복구문
			//}