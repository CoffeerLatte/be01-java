package day05_array.ex01;



public class MainEntry {

		public static void main(String[] args) {
			
//			1. 
			char[] ch; // -> 배열 선언
			ch = new char[4]; // 배열 생성, 메모리에 할당되기 시작함.
			
			char[] ch2 = new char[5]; // 배열 선언과 생성을 동시에
			
			// 배열 초기화
			ch[0] = 'j';
			ch[1] = 'a';
			ch[2] = 'v';
			ch[3] = 'a';
			
			System.out.println("======================  2. ==================================================");
		// 2. 
			for (int i = 0; i <4; i++) {
				System.out.println(ch[i]);
			}
//			System.out.println(ch[0]+""+ch[3]);
//			System.out.println(ch[0]+""+ch[3]);
			System.out.println("================         3. ==================================================");
			
			
		// 3. 
			
			char[] ch3 = {'j','a','v','a','p','o','e','t','u','f','g','3'};
			// char[] ch3 = new char[6];
			
			System.out.println("배열의 길이: "+ch3.length);
			for (int i = 0; i < ch3.length; i++) {
				
				System.out.println(ch3[i]);
			}
			System.out.println("================         4. ==================================================");
			
					String[] str = { "2", "bdsd,", "dassadasd", "qqw"};
					for (int i = 0; i < str.length; i++) {
						System.out.print(str[i]+ " ");
					}
				
					
					System.out.println("================         5. ==================================================");		
					
			char [] ch4 = { };
			char []  ch5= new char[] {};
					
		}
}




































////1차원 배열 사용
////char[] index = new char[30];
////
////int i[] = new int[30];
////
//char[] i = new char[2][3];	[행크기][열크기]
//
//
//char[] i = new char[2][3][4]; [면크기][행크기][열크기]
//