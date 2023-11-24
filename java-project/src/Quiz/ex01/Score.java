package Quiz.ex01;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		
		System.out.print("3과목의 점수를 입력해 주세요 : ");
		
		
		Scanner sc = new Scanner(System.in);
		
		int sum, avg,kor,eng,com;
		
		
		kor = sc.nextInt();
		eng = sc.nextInt();
		com = sc.nextInt();
		
		sum =  kor + eng + com;
		avg = sum / 3;
		
		
		
		if(avg <= 100 && avg >= 90)
		{
			System.out.println("A 학점입니다.");
		}
		else if(avg <=90 && avg >= 80)
		{
			System.out.println("B 학점입니다.");
		}
		else if(avg <=80 && avg >= 70)
		{
			System.out.println("C 학점입니다.");
		}
		else if(avg <=70 && avg >= 60)
		{
			System.out.println("D 학점입니다.");
			
		}
		else
		{
			System.out.println("F 학점입니다.");
		}
		
		System.out.println("총점은 "+ sum+ "입니다." +" "+"평균은 "+ avg+"입니다.");
		System.out.println("국어 : "+" "+kor+"점 "+"영어 : "+eng+"점 "+" "+"전산 : "+com+"점 ");
	}
}
