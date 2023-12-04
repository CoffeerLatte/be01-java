package test;

import java.util.Scanner;

public class Homework7 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String a="";
	String b="";
	
	int c, c1, c2,c3 ,c4,c5;
	int z1,z2,z3,z4,z5,z6;
	
	a = sc.next();
	b= sc.next();
	
	z1 = Character.getNumericValue(a.charAt(0));
	z2 = Character.getNumericValue(a.charAt(1));
	z3 = Character.getNumericValue(a.charAt(2));
	z4 = Character.getNumericValue(b.charAt(0));
	z5 = Character.getNumericValue(b.charAt(1));
	z6 = Character.getNumericValue(b.charAt(2));
	c =  (z6*z3 + z6*z2*10 + z6*z1*100);
	c1 =  ((z5*z3 + z5*z2*10 + z5*z1*100))*10;
	c2 =  ((z4*z3 + z4*z2*10 + z4*z1*100))*100;
	c3 = c+c1+c2;
	
	
	
	System.out.println(c);
	System.out.println(c1/10);
	System.out.println(c2/100);
	System.out.println(c3);

	
	
	
	
}
}
