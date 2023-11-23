package Quiz.ex01;

import java.util.*;

public class ScoreExe {

	public static void main(String[] args) {
		
	
	
		
		Scanner sc = new Scanner(System.in);
		
	
		
		int sum, avg, cnt, kor, eng, com;
	
		
		while(true) {
		do {
			System.out.print("3과목의 점수를 입력해 주세요 국어, 영어, 전산 순 1~100까지만 : ");
		kor = sc.nextInt();
		}while((kor<0||kor>100));
		
		System.out.println("점수를 더 입력 받을 것 인지? (y/n)");		
		char yesno = new Scanner(System.in).next().charAt(0);
		if(yesno == 'n' || yesno == 'N') break;
		
		
		do {
			System.out.print("3과목의 점수를 입력해 주세요 국어, 영어, 전산 순 1~100까지만 : ");
		eng = sc.nextInt();
		}while(eng<0||eng>100);
		
		System.out.println("점수를 더 입력 받을 것 인지? (y/n)");
		char yesno1 = new Scanner(System.in).next().charAt(0);
		if(yesno1 == 'n' || yesno1 == 'N') break;
		
		do {
			System.out.print("3과목의 점수를 입력해 주세요 국어, 영어, 전산 순 1~100까지만 : ");
		com = sc.nextInt();
		}while(com<0||com>100);
		
		System.out.println("입력이 마무리 되었습니다. y를 눌러주세요");		
		char yesno2 = new Scanner(System.in).next().charAt(0);
		if(yesno2 == 'n' || yesno2 == 'N') break;
		
		
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
		
		
		
		System.out.println("입력이 마무리 되었습니다. 새로운 입력을 진행해주세요.");
		
		char yesno3 = new Scanner(System.in).next().charAt(0);
		if(yesno3 == 'n' || yesno3 == 'N') break;
		
		}
		
		
	}
	
}






//while(true) {
//	do {
//		System.out.print("3과목의 점수를 입력해 주세요 국어, 영어, 전산 순 1~100까지만 : ");
//		
//		su = new Scanner(System.in).nextInt();
//		System.out.println(su);
//
//	}
//	while(su <= 0 && su >= 100);
//	
//	
//	System.out.println("점수를 더 입력 받을 것 인지? (y/n)");
//	
//	char yesno = new Scanner(System.in).next().charAt(0);
//	if(yesno == 'n' || yesno == 'N') break;
//}
