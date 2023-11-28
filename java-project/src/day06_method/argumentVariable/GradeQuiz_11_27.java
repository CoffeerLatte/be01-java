package day06_method.argumentVariable;
import java.util.*;
public class GradeQuiz_11_27 {

//	문제5] 성적처리 프로그램 함수로 분할(분리)할것
//입력 함수 input()  - 이름 , 국어, 영어,전산 점수
//총점 함수 total(~~~) - 총점 구하는 함수
//평균 함수 average( ~~ ) - 평균 구하는 함수
//평점(학점) grade( ~~ ) - 학점 구하는 함수
//출력 함수 output( ) - 결과 출력하는 함수

	public static void main(String[] args) {
		
		String name;
		int kor, eng, com;
		
		in();
		System.out.println(sum());
		//System.out.println(avg());
		
	}
	
	
	public static int in() {		// INPUT 함수 이름, 과목 입력
		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor=0, eng=0, com=0, sum1=0;
		
		
		System.out.println("이름은 무엇인가요? : ");
		name = sc.next();
		System.out.println("국어의 점수를 입력해주세요. : ");
		kor = sc.nextInt();
		System.out.println("영어의 점수를 입력해주세요. : ");
		eng = sc.nextInt();
		System.out.println("전산의 점수를 입력해주세요. : ");
		com = sc.nextInt();
		sum1= kor + eng+ com;
		return sum1;
		
	}
	
	public static int sum() {			// sumavg = 총점 및 평균 함수
		
		
	
		int  sum;
	
		sum = in();
		
		
		
		
		return sum;
		
		
	}
	public static int avg() {			// sumavg = 총점 및 평균 함수
		
		
		
		
	
		
		double avg;
		
		avg = in() / 3;
		
		
		return (int)avg;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	public static char grade(int kor, int eng, int com) {
		
		int avg = (kor + eng + com)/3;
		
		int cal = avg/10;
		char grades=' ';
		switch(cal) {
		
		case 10:
		{
			System.out.println("A");
			grades = 'A';
					break;
		}
		case 9:
		{
			System.out.println("B");grades = 'B';break;
		}
		case 8:
		{
			System.out.println("C");grades = 'C';break;
			
		}
		case 7:
		{
			System.out.println("D");grades = 'D';break;
		}
		case 6:
		{
			System.out.println("F");grades = 'F';break;
		} // case 종료
			
		}	//switch 종료

		
	return grades;
	
	
	}	// grade 함수 종료
	public static void out(String name, char grades,int kor, int eng, int com) {
		System.out.println("이름은 : "+ name);
		System.out.println("학점은 : "+ grades);
		System.out.println("국어는: "+ kor+ "영어는: "+eng+"전산은: "+ com+" 입니다.");
		
		
		
	}// 출력 함수 종료.
	
	
}
