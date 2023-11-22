package day03_Controller.Quiz;
import java.util.Scanner;
public class QuizIf3 {

	
		// 전산,영어, 국어, 점수를 입력 받아서 평균 60점이상이고, 각 과목 과락 40점 이하면 과목 불합격 프로그램
	public static void main(String[] args) {
		
	
	
	
	int com, eng, kor;
	
	
	System.out.print("전산 점수는? = ");
	
	com = new Scanner(System.in).nextInt();
	
	System.out.print("영어 점수는? = ");
	
	eng = new Scanner(System.in).nextInt();
	
	System.out.print("국어 점수는? = ");
	
	kor = new Scanner(System.in).nextInt();
	
	
	
	
	
	double avg;
	avg = (com + eng + kor) /3;

	if (avg > 60 ) {
	
		if ( com <= 40)
		{
			System.out.printf("불합격입니다. com이 40점 이하입니다. 평균은 %.2f 입니다.",avg  );
		}
		if ( kor <= 40)
		{
			System.out.printf("불합격입니다. kor이 40점 이하입니다. 평균은 %.2f 입니다.",avg  );
		}
		if ( eng <= 40)
		{
			System.out.printf("불합격입니다. eng이 40점 이하입니다. 평균은 %.2f 입니다.",avg  );
		}
		if ((com > 40) && (eng > 40) && (kor > 40))
		{
			System.out.print("합격");
		}
	}
	else
	{
		System.out.print("평균점수 미달 불합격");
	}

	
	
	}
	
	
}

