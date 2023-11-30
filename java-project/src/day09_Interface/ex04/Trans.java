package day09_Interface.ex04;
import java.util.*;
public class Trans implements Subway, Airplane, Bicycle, Bus {
	String b="*";
	public void start() {
		System.out.println(b+"가 출발합니다.");
	}
	public void stop() {
		System.out.println(b+"가 도착합니다.");
	}
	
	
	@Override
	public String way() {
		Scanner sc = new Scanner(System.in);
		
		String a,c;
		
		a=sc.next();
		
		
		if(a.equals("지하철"))
		{
		System.out.println("사용하는 대중교통은 "+Subway.sub+" 입니다.");
		b = "지하철";
		}
		else if(a.equals("자전거"))
		{
		System.out.println("사용하는 대중교통은 "+Bicycle.sub+" 입니다.");
		b = "자전거";
		}
		else if(a.equals("비행기"))
		{
		System.out.println("사용하는 대중교통은 "+Airplane.sub+" 입니다.");
		b = "비행기";
		}
		else if(a.equals("버스"))
		{
		System.out.println("사용하는 대중교통은 "+Bus.sub+" 입니다.");
		b = "버스";
		}
		else
		{
			System.out.println("다시 시작하세요.");
		}
		
		return b;
	}
	
	
	
	
	
	
		
}
