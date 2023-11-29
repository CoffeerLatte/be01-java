package day08_Inheritance.ex01;

import day07_oop.ex01.circles;

public class Circle extends Point {

	private int r;
	
	
	public Circle() {
		r= 5;
		System.out.println("You just called Circle default Constructor ");
	}

	public Circle(int x, int y, int r) {
		this.r = r;
		System.out.println("Circle 3개 constructor call");
	}
	
	public Circle(int r)
	{
			super();
			this.r =r;
			System.out.println("circle 1개 constructor");
	}
	public void dp() {
		super.ds();
		System.out.println(", "+r);
	}
	
}
