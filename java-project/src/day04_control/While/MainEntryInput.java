package day04_control.While;

public class MainEntryInput {
public static void main(String[] args) {
	int x =3, y =5;
	
	if (x==5)
		System.out.println("same");
	else
		System.out.println("not same");
	
	String s1 = new String("Korea");
	String s2 = new String("korea");
	
	if(s1.equalsIgnoreCase(s2))
	{
		System.out.println("same");
		
	}
	else System.out.println("not same");
}
}
