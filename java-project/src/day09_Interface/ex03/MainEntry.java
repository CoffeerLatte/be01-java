package day09_Interface.ex03;

import day09_Abstract.ex02.Shape;
import day09_Interface.ex02.IDraw;

public class MainEntry {

	
	public static void main(String[] args) {
		
		
		MultiClass mc = new MultiClass();
		
		mc.draw();
		mc.tshow("전승민");
		mc.show("광개토");
		System.out.println("==========================");
		IDraw i = new MultiClass();
		
		i.draw();
		System.out.println(i.su);
		
		System.out.println("===========================");
		
		Shape S =  new MultiClass();
		
		System.out.println(S.calc(5.5, 9));
		S.show("김");

		
		
	}
}
