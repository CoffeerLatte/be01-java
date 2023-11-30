package day09_Interface.ex04;

import java.util.Scanner;

public class MainEntry  {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Trans tr = new Trans();
		
		String t,y,u;
		System.out.println("무엇을 타셨나요?");
		tr.way();
		
		
		System.out.println(tr.b+"를 출발하시겠습니까? yes or no");
		
		t= sc.next();
		
		if(t.equals("yes"))
		{
			tr.start();
		}
		else
		{
			System.out.println(tr.b+"가 도착합니다.");
		}
		
		
		
		
	}
	
		
}
