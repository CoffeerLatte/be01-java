package day07_ArrayMethod;

public class MainEntry {

	
		public static void main(String[] args) {
			int x= 3, y =5;
			int  result = methodEx(x,y);
//			System.out.println(result);
		
			int[] arrResult = methodEx2();
			int[][] arrResult2 = methodEx3();
//			System.out.println(arrResult[1]);
//			for (int i = 0; i < arrResult.length; i++) {
//				System.out.print(arrResult[i]+"\t");
//			}
//			
//			for (int item : arrResult) {
//				System.out.println(item +"");
//			}
			for (int i = 0; i < arrResult2.length; i++) {
				for (int j = 0; j < arrResult2[i].length; j++) {
					System.out.print(arrResult2[i][j]+"\t");
					if(arrResult2[i][j] == 4)
						System.out.println();
				}
				
			}
			System.out.println();
			System.out.println("***************************************************************");
			
			
			
			int index = 0;
//			for (int[] item: arrResult2)
//			{
//				for(int arritems: item) {
//					System.out.print(arritems+ " "+index++);
//					System.out.println(index);
//					System.out.println(item.hashCode());
//				}
//				
//				System.out.println();
//			}
			
			for (int[] item: arrResult2) {
				
				System.out.println(item +" " +index++);
			}
			
			
			
		}

		private static int[][] methodEx3() {
			
			int[][] arr = {{1,2,3,4},{5,6,7,8}};
			
			return arr;
		}

		private static int[] methodEx2() {
			
			int[] arr = {1,2,3,4,5,6,7,8};
			
			
			return arr;
		}

		public static int methodEx(int x, int y) {
			return x+y;
		}
}
