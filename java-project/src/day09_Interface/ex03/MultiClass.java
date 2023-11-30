package day09_Interface.ex03;

import day09_Abstract.ex02.Shape;
import day09_Interface.ex02.IDraw;



public class MultiClass extends Shape implements Test, IDraw {

	
	
	String name = "이순신";
	
	
	
	
	
	@Override
	public void draw() {
			System.out.println("IDraw Interface Method");
	}



	@Override
	public double calc(double x, int y) {
		System.out.println("Shape's Abstract Method");
		return 0;
	}

	@Override
	public void show(String name) {
		System.out.println("Shape class Method");
		System.out.println(name + "hi");
	}



	@Override
	public void tshow(String name) {
		System.out.println("Shape class Method");
		
	}

}
