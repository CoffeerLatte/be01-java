package day10_API.string;




public class StringMain {
	public static void main(String[] args) {
		
		String s1 = "jsm";
		
		String s2 = "JSM";
		
		System.out.println("s1= "+s1+", "+"s2= "+s2);
		System.out.println(s1.concat(s2));	//문자열 결합
		
	//	System.out.println(s1+s2);	== System.out.println(s1.concat(s2));
		
		System.out.println(s2.replaceAll("S", "sdsdddssds"));		// 실제 데이터가 변경되지는 않는다.
		
	//	s2= s2.replace("S", "asd");		//실제 데이터 변경
		
		System.out.println(s2);
		System.out.println("===================================================================");
		
		
		String s3 = new String("         ab              cd        ef     ");
		System.out.println(s3);
		System.out.println("Length= "+s3.length());
		
		s3 = s3.trim();
		
		System.out.println("Length= "+ s3.length()+"\n"+s3);
		
		int[] arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			
		}
		
//		String s4 = new String("abc ededsda sadaasdsad dadasds es sdfsfdsfef 512313231212");
		String s4 = new String("abc/ededsda/sadaasdsad/dadasds/es/sdfsfdsfef/512313231212");
		String[] s5 = s4.split("/");
		
		for (int i = 0; i < s5.length; i++) {
			System.out.println("분리된 "+ i + " 번째 문자열: "+ s5[i]);
		}
		
		String s6 = "123-4567-897";
				
				String[] s7= s6.split("-");
		for (int i = 0; i < s7.length; i++) {
			System.out.println("분리된 "+ i + " 번째 문자열: "+ s7[i]);
		}
		
		
		
		
		
		String s8 ="1 234567 89a bcd eff01 23 13 21 3";
		char ch = s8.charAt(15);
		System.out.println(ch);
		System.out.println(s8.indexOf('f'));
		System.out.println(s8.lastIndexOf('f'));
		
		System.out.println(s8.substring(0,20));
		
		System.out.println("소문자 출력 toLowerCase(): "+s2.toLowerCase());
		System.out.println("소문자 출력 toUpperCase(): "+s1.toUpperCase());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
