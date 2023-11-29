package Quiz.ex01;

import java.util.Scanner;

public class ScoreFin {
	private int kor, eng ,com, tot=0;
	
	private double avg =0.0;

	
	
	
	
	
	
	
	
	public ScoreFin() {
		// kor = eng = com =0;
		input();
	}
	public ScoreFin(int kor, int  eng ,int com) {
		
		
		this.kor = 0;
		this.eng = 0;
		this.com = 0;
		
	}
	
	public ScoreFin(int kor) {
		super();
		this.kor = kor;
	}
	

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	public int getTot() {
		this.tot = getKor() + getEng() + getCom();
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		avg = getTot() /3;
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
		
	}
	public void dp() {
		System.out.printf("Kor : %d, Eng : %d,  Com : %d\n",getKor(),getEng(), getCom());
		System.out.printf("Tot : %d, Avg : %.2f",getTot(), getAvg());
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("kor = ");
		this.kor = sc.nextInt();
		System.out.println("eng = ");
		this.eng = sc.nextInt();
		System.out.println("com = ");
		this.com = sc.nextInt();
	}
}
