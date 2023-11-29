package quizInheritance;

// import quizInheritance.*;


public class Student extends Saraam {

	private int jumsu;

	protected Student () {
		jumsu = 100;
	//	System.out.println("점수: "+ jumsu);
		
	}
	
	
	public int getJumsu() {
		return jumsu;
	}

	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	
	
	public void dps() {
		super.dp();
		System.out.println("점수: "+jumsu);
	}
	
	
	
}
