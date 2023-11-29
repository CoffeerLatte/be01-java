package Quiz.ex01;

public class Scorereturn {

		public static void main(String[] args) {
			ScoreFin s = new ScoreFin();
			
			// s.dp();
			s.setKor(100);
			s.setEng(100);
			s.setCom(100);
			s.dp();
			System.out.println();
			System.out.println("================================");
			
			
			ScoreFin s2 = new ScoreFin(55, 77, 99);
			
			s2.dp();
			
		}
}
