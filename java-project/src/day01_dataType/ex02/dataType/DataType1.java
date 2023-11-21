package day01_dataType.ex02.dataType;

public class DataType1 {
	public static void main(String[] args) {
		
		char ch = 'A'; // ASCII CODE
		System.out.println(ch +",ASCII code =" + (int)ch);
		System.out.println('B');
		System.out.println((int)'b');
		
		int num = 9;		// 10진수
		int xNum = 0x9;		// 16진수 파일
		int oNum = 011;		// 8진수 파일
		int bNum = 0B1010;	// 이진수 파일
		
		System.out.println("2진수: "+bNum);
		System.out.println(xNum);
		System.out.println(oNum);
		System.out.println(bNum);
		
		
		System.out.printf("%d %d  \n", 010, 0xA);
		
		System.out.println("-----------------------------");
		System.out.printf("%x %x \n", 10, 10);
		System.out.printf("%o %o \n", 10, 10);
	}
	
}



















//
//public class dataType {
//	public static void main(String[] args) {
//		
//		short sh = -32768;
//		int su = 32770;
//		
//		// su = sh; // 자동형변환
//		sh = (short)su;		//명시저 형변환 데이터 손실발생
//		
//		System.out.println(sh+","+su);
//	}
//	
//}