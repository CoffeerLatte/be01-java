package day07_oop.ex01;

public class TV {
	// 멤버가 티비의 색상, channel;
	private String Col;
	private int Cha;
	
	public TV() {		//default constructor
					Col = "gray";
					Cha = 5;
	}
	
	
	public TV(int Cha) {		
		this.Cha = Cha;							//중복정의 가능하다. 아래 2개 + 이거까지 하나까지 사용하면 default 생성자를 잃음.
}
	
	
	public TV(String Col) {		
		//중복정의 가능하다.
		this.Col = Col;
}
	
	
	public TV(String Col, int Cha) {		
															//중복정의 가능하다.
		this.Col = Col;
		this.Cha=Cha;
}
	
	
	
	
	
	
	
	
	public String getCol() {
		return Col;
	}
	public void setCol(String col) {
		Col = col;
	}
	public int getCha() {
		return Cha;
	}
	public void setCha(int cha) {
		Cha = cha;
	}
	public void Display() {
		System.out.println(Col+", "+Cha);
	}
	
}
