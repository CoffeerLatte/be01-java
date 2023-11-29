package Quiz.scoreClass;
import java.util.*;
public class Main {

	
		public static void main(String[] args) {
			getandset gs = new getandset();
			Scanner sc = new Scanner(System.in);
			
			int a,b,c;
			char grade=' ';
			
			int kor, eng, com, sum, avg, f;
			
			f= 4;
			System.out.print("국어 점수를 입력하세요 :  ");
			a = sc.nextInt();
			System.out.print("영어 점수를 입력하세요 :  ");
			b = sc.nextInt();
			System.out.print("전산 점수를 입력하세요 :  ");
			c = sc.nextInt();
			
			
			gs.setKor(a); 
			gs.setEng(b); 
			gs.setCom(c); 
			
			
			sum = gs.getKor()+gs.getEng()+gs.getCom();
			
			avg = sum /3;
			
			
			switch(avg/10) {
			
			case 10:
				grade = 'A'; System.out.println(grade); break;
				
				case 9:
					grade = 'B';break;
					case 8:
						grade = 'C';break;
						case 7:
							grade = 'D';break;
							case 6:
								grade = 'F';
			}	//end switch
			
			gs.setSum(sum);
			gs.setAvg(avg);
			gs.setGrade(grade);
			
			gs.ds();
			
			}
			
			
			
			
		}

