package Quiz.ex01;

import java.util.Scanner;

public class Score2 {

	public static void main(String[] args) {
		
		System.out.print("3과목의 점수를 입력해 주세요 국어, 영어, 전산 순: ");
		
		
		Scanner sc = new Scanner(System.in);
		
	
		
		int sum, avg, cnt, kor, eng, com;
		
		
		kor = sc.nextInt();
		eng = sc.nextInt();
		com = sc.nextInt();
		
		
		sum =  kor+ eng + com;
		avg = sum / 3;
		cnt = avg / 10;
	
		
		
		switch (cnt)
		{
		case 10:
		{
			System.out.println("A학점입니다.");
			break;
		}
		case 9:
		{
			System.out.println("B학점입니다.");
			break;
		}
		case 8:
		{
			System.out.println("C학점입니다.");
			break;
		}
		case 7:
		{
			System.out.println("D학점입니다.");
			break;
		}
		default :
		{
			System.out.println("F학점입니다.");
			break;
		}
		}
		
		System.out.println("총점은 "+ sum+ "입니다." +" "+"평균은 "+ avg+"입니다.");
		System.out.println("국어 : "+" "+kor+"점 "+"영어 : "+eng+"점 "+" "+"전산 : "+com+"점 ");
	}
}
