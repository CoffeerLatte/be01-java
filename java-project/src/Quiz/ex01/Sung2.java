package Quiz.ex01;

import java.util.Scanner;

// 7명의 3과목 입력 받고, 총점, 평균, 학점 구하기 - 배열 이용하기 
public class Sung2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // 객체 생성, 메모리에 할당, 생성자함수자동호출
		
		int in = 5;
		int su = 2;
		
		int[][] subject = new int[in][su];
		
//		int[] kor = new int[INWON];
//		int[] eng = new int[INWON];
//		int[] com = new int[INWON];
		int[][] tot =  new int[in][su];
		double[][] avg = new double[in][su];
		String[][] name = new String[in][su];
		int num[][] = new int[in][su];
			
		char[][] grade = new char[in][su];
		double avgAll = 0.0;
		int totalAll = 0;
		
		// input	
		
			for (int i = 0; i < in; i++) {
				
			
			for (int j = 0; j < su; j++) {
				System.out.println((j+1)+"번째 학생 정보 입력 : " );
				System.out.print("number = "); num[i][j] = sc.nextInt();
				System.out.print("name = "); name[i][j] = sc.next();
				System.out.print("subject = "); subject[i][j] = sc.nextInt();
				tot[i][j] = subject[i][j];
				avg[i][j] = tot[i][j] / 3.0; 
				
				totalAll += tot[i][j]; 
				avgAll = (double) totalAll / in;
				
				switch ( (int) avg[i][j] / 10 ) {	
				case 10:
				case 9: grade[i][j] = 'A';	break;
				case 8: grade[i][j] = 'B';	break;
				case 7: grade[i][j] = 'C';	break;
				case 6: grade[i][j] = 'D';	break;
				default: grade[i][j] =  'F';		
				
				for(int k = 0; k < in; k++) {
					System.out.println("\n\n****  " +name[k] +"님의 성적표 **********");
					System.out.println("번호 : "+ num[k] + " 국어 : " + subject[i][j] + " 영어 : " + subject[i][j] + " 전산 : " + subject[i][j]);
					System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c ", tot[i][j], avg[i][j], grade[i][j] );
				} // output for end
				
				System.out.printf("\n\n학급 총점 : "+totalAll +"\n학급 평균 : %.2f " , avgAll);

				
			} 
			}
			
			
			

}
	
}
}
//			System.out.println((i+1)+"번째 학생 정보 입력 : " );
//			System.out.print("number = "); num[i] = sc.nextInt();
//			System.out.print("name = "); name[i] = sc.next();
//			System.out.print("subject = "); subject[i][su] = sc.nextInt();
//			System.out.print("eng = "); eng[i] = sc.nextInt();
//			System.out.print("com = "); com[i] = sc.nextInt();
			
			//총점/평균 처리까지 가능
//			tot[i] = subject[in][su];
//			avg[i] = tot[i] / 3.0; 
			
			//학급 전체 총점/평균 구하기
//			totalAll += tot[i]; 
//			avgAll = (double) totalAll / in;
//			
//			switch ( (int) avg[i] / 10 ) {	
//				case 10:
//				case 9: grade[i] = 'A';	break;
//				case 8: grade[i] = 'B';	break;
//				case 7: grade[i] = 'C';	break;
//				case 6: grade[i] = 'D';	break;
//				default: grade[i] =  'F';		
//			} // end switch
//		} // input for end
		
		
		// output
//		for(int i = 0; i < in; i++) {
//			System.out.println("\n\n****  " +name[i] +"님의 성적표 **********");
//			System.out.println("번호 : "+ num[i] + " 국어 : " + subject[in][su] + " 영어 : " + subject[in][su] + " 전산 : " + subject[in][su]);
//			System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c ", tot[i], avg[i], grade[i] );
//		} // output for end
//		
//		System.out.printf("\n\n학급 총점 : "+totalAll +"\n학급 평균 : %.2f " , avgAll);

		
	




///*
//result>
//	이도연님의 성적표 *****
//	국어 : 100, 영어: 100, 전산 : 100
//	총점 : 300, 평균: 100.00, 학점 : A 
//	
//	김도연님의 성적표 *****
//	국어 : 100, 영어: 100, 전산 : 100
//	총점 : 300, 평균: 100.00, 학점 : A 
//	
//	박도연님의 성적표 *****
//	국어 : 100, 영어: 100, 전산 : 100
//	총점 : 300, 평균: 100.00, 학점 : A 
//	
//*/
//​