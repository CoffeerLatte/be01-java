package day09_Abstract.ex03;

public class Bus extends Trans {

	@Override
	public String start() {
		System.out.println("버스로 이동합니다.");
		return result;
	}

	@Override
	public String stop() {
		
		System.out.println("버스에서 내립니다.");
		return results;
	}

	@Override
	public String status() {
		
		System.out.println("현재 이동수단은 버스 입니다.");
		st = "Bus";
	//	System.out.println("현재 버스 상태는: "+start()+"입니다.");
	//	System.out.println("현재 버스 상태는: "+stop()+"입니다.");
		return "";
	}
	
	@Override
	public String output() {
		st = "bus";
		return st;
		
	}
	
	
	
}
