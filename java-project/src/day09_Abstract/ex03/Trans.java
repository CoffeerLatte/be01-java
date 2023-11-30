package day09_Abstract.ex03;

public abstract class Trans {

	String result="";
	String results = "";
	String st = "";
	
	public abstract String start();
	public abstract String stop();
	public abstract String status();
	public abstract String output();
	public void view() {
		
		System.out.println("bus를 탑승하여");
	}
	
	
}
