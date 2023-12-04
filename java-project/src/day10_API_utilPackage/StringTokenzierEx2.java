package day10_API_utilPackage;

import java.util.StringTokenizer;

public class StringTokenzierEx2 {

		public static void main(String[] args) {
			StringTokenizer st = new StringTokenizer("사과=5|초코렛=3|샴폐인=1","=|",true);
			
			while(st.hasMoreTokens()) {
				
				//System.out.println(st.nextToken());
				
				
				
				
				String str = st.nextToken();
				if(str.equals("="))
					{
						System.out.println("\t");
						}
				else if(str.equals("|"))
				{
					System.out.println("\n");
				}
				else
					System.out.println(str);
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
		}
}
