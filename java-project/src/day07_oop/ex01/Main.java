package day07_oop.ex01;

public class Main {
public static void main(String[] args) {
	Points pt =  new Points();
	pt.Display();
	pt.SetX(100);
	pt.SetY(100);
	pt.Display();
	
	System.out.println("circle object");
	
	circles cl = new circles();
	
	
	
	cl.Display();
	cl.setX(100);
	cl.setY(100);
	cl.setR(100);
	cl.Display();
	
	System.out.println("=============================================================");
	
	
	
	TV t = new TV();
 
	t.Display();
	t.setCha(50);
	t.setCol("Black");
	t.Display();
	
	
}
		
		
}
