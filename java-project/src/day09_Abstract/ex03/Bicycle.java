package day09_Abstract.ex03;

public class Bicycle extends Trans {

	@Override
	public String start() {
		
		System.out.println("자전거로 이동합니다.");
		
		return result;
	}

	@Override
	public String stop() {
		
		System.out.println("자전거로 이동합니다.");
		
		return results;
	}

	@Override
	public String status() {
		System.out.println("현재 이동수단은 자전거 입니다.");
	//	System.out.println("현재 자전거 상태는: "+start()+"입니다.");
	//	System.out.println("현재 자전거 상태는: "+stop()+"입니다.");
		return "==========";
	}

	@Override
	public String output() {
		// TODO Auto-generated method stub
		return null;
	}

}
