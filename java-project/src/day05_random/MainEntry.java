package day05_random;

public class MainEntry {
public static void main(String[] args) {
	
	int cnt =0;
	
	while (true){
	
	int a = (int)(Math.random()*100+1);
		
	
	if(a >= 1) {
	//System.out.println(a);
	cnt ++;
	if(cnt%2 ==0)
	{
	System.out.print("현재 카운트 : " + cnt+"\t"+"짝수입니다.");
	}
	else
	{
		System.out.println("현재 카운트 : " + cnt);
	}
		
		
	}
	if(cnt ==500)
	{
	break;
	}
	
	
	
	
	
	}
	

	
//	if(a > 10)
//	{
//		System.out.println();
//	}
//	else
//	{
//		break;
//	}
	
}
}
