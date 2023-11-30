package day09_Abstract.ex03;
import java.util.*;
public class MainEntry {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a,b,c,d;
		
		Trans x = new Bus();
		Trans y = new AirPlane();
		Trans z = new Subway();
		Trans t = new Bicycle();
		
		System.out.println("이동 수단이 무엇인가요? (Bus, AirPlane, Subway, Bicycle )");
		
		a = sc.next();
		
		if (a.equals("Bus"))
		{
			x.status();
			System.out.println("버스를 타시겠습니까?(start) 내리시겠습니까?(stop)");
			b=sc.next();
			
			if(b.equals("start"))
			{
				x.start();
			}
			else
			{
				x.stop();
			}
			
		}
		if (a.equals("AirPlane"))
			{
			y.status();System.out.println("비행기를 타시겠습니까?(start) 내리시겠습니까?(stop)");
			b=sc.next();
			if(b.equals("start"))
			{
				y.start();
			}
			else
			{
				y.stop();
			}
			}
			
			if (a.equals("Subway"))
			{
				z.status();System.out.println("지하철을 타시겠습니까?(start) 내리시겠습니까?(stop)");
				b=sc.next();
				if(b.equals("start"))
				{
					z.start();
				}
				else
				{
					z.stop();
				}
				}
				
			
				if (a.equals("Bicycle"))
					{
					t.status();System.out.println("자전거를 타시겠습니까?(start) 내리시겠습니까?(stop)");
					b=sc.next();
					if(b.equals("start"))
					{
						t.start();
					}
					else
					{
						t.stop();
					}
					}
					}
		
		
		
		
	
		
	}
	

