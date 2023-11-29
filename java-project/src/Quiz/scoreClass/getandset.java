package Quiz.scoreClass;
import java.util.*;


public class getandset {

	Scanner sc = new Scanner(System.in);
	
	private int sum, avg;
	private char grade;
	
	
	private int kor,eng,com;

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
	
	
	
	public void setSum(int sum) {
		this.sum = kor+eng+com;
	}
	
	public void setAvg(int avg)
	{
		this.avg = sum /3;
	}
	
	public void setGrade(char grade)
	{
		this.grade = grade;
	}
	
	public void ds() {
		
		System.out.println("국어= "+ kor+" 영어= "+ eng+ " 전산= "+ com+" "+" 학점은: "+ grade + " 총점은: "+ sum+ " 평균은 "+ avg);
	}
}
