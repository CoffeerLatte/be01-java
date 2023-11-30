package day09_Abstract.ex03;

public class AirPlane extends Trans  {

	@Override
	public String start() {
		
		System.out.println("비행기로 이동합니다.");
		
		return result;
	}

	@Override
	public String stop() {
		
		System.out.println("비행기로 이동합니다.");
		
		return results;
	}

	@Override
	public String status() {
		System.out.println("현재 이동수단은 비행기 입니다.");
	//	System.out.println("현재 비행기 상태는: "+start()+"입니다.");
	//	System.out.println("현재 비행기 상태는: "+stop()+"입니다.");
		return "==========";
	}

	@Override
	public String output() {
		// TODO Auto-generated method stub
		return null;
	}

}
