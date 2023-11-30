package test;
import java.util.*;
public class Homework5 {
public static void main(String[] args) {
	
	
	
Scanner sc = new Scanner(System.in);

int count=0;


String c= sc.nextLine();


char d=' ';

if(c.length() < 1000000) {
for (int i = 0; i < c.length(); i++) {
	if(c.charAt(i) == d)
	{
		count += 1;
	}
}
}
else {
	System.out.println("잘못됐음.");
}

System.out.println(count);


}
}
