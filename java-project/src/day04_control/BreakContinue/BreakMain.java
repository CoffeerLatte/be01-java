package day04_control.BreakContinue;

public class BreakMain {

		public static void main(String[] args) {
//	1~100까지 중에서 짝수중에서 짝수의 개수를 구하면 한화면에 10개씩 출력
			int cnt=0;
			
	
				
				
				
		 
		label:	for (int i = 1; i < 101; i++) {
				
				if(i%2 == 0 ) {
					cnt += 1;
					System.out.print(i+"\t");
				}
				
				if(i%20 ==0 )
					System.out.println();
				continue label;

			}
			
			System.out.println("짝수의 개수는 : "+ cnt);
		}
}


















































//package day04_control.BreakContinue;
//
//public class BreakMain {
//
//		public static void main(String[] args) {
//			
//			lable : //식별자, 식별자의 위치로 빠져나감. break.
//					// continue = 시작점을 돌림.
//			
//			
//			for (int i =1; i < 6; i++) {
//				for (int j = 1; j < 6; j++) {
////					if(j ==3 ) break lable;
//					if(j ==3 ) continue lable;
//					System.out.println("i: "+i+","+"j : "+j);
//				}
//				
//			}
//		}
//}
