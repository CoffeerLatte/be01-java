package day10_API_utilPackage;

import java.util.Date;
import java.util.Calendar;

public class MainEntry {

	
		public static void main(String[] args) {
			
			Calendar c = Calendar.getInstance();
			
			System.out.println(c.get(Calendar.YEAR)+"년");
			System.out.println(((c.get(Calendar.MONTH))+1)+"월");		// 월은 0부터 시작하기 때문에 +1을 해줘야함.
			System.out.println(c.get(Calendar.DATE)+"일");
			
			
			Date date = new Date();
			int h = date.getHours();
			int m = date.getMinutes();
			int s = date.getSeconds();
			
			System.out.println("현재 시간은: "+h+"시"+m+"분"+s+"초");
			
			
			System.out.println("===========================");
			
			
			Calendar c1 = Calendar.getInstance();
			Calendar c2 = Calendar.getInstance();
			
			
			c2.set(2022,12,20,0,0);			//셋팅하는 함수
			
			
			if(c1.after(c2)) {
				
				System.out.println("0");
			}
			else if(c1.before(c2))
			{
				System.out.println("X");
				
			}
			else if(c1.equals(c2))
			{
				System.out.println("==");
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
}
