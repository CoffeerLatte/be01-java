package day05_random;

import java.util.Random;

import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	
	int a = (int)(Math.random()*100);
	int s = 0;
	
	s = a;
	
	// System.out.println(s);
	
	if (a==0)
	{
		a = a+1;
	}
	
	Scanner sc = new Scanner(System.in);
	
	int b,c,d,e,f;
	
	f = sc.nextInt();
	
	if(f>s)
	{
		System.out.println("더 낮은 값을 입력하세요.");
	}
	else {
		System.out.println("더 높은 값을 입력하세요");
	}
	if(f==s)
	{
		System.out.println("정답입니다. 난수는 : "+ s+"입니다.");
		
	}
	
	
	b = sc.nextInt();
	if(b>s)
	{
		System.out.println("더 낮은 값을 입력하세요.");
	}
	else {
		System.out.println("더 높은 값을 입력하세요");
	}
	c = sc.nextInt();
	if(c>s)
	{
		System.out.println("더 낮은 값을 입력하세요.");
	}
	else {
		System.out.println("더 높은 값을 입력하세요");
	}
	d = sc.nextInt();
	if(d>s)
	{
		System.out.println("더 낮은 값을 입력하세요.");
	}
	else {
		System.out.println("더 높은 값을 입력하세요");
	}
	e = sc.nextInt();
	
	if(e>s)
	{
		System.out.println("더 낮은 값을 입력하세요.");
	}
	else {
		System.out.println("더 높은 값을 입력하세요");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}