package day06_array.ex03;

public class Quiz2 {
public static void main(String[] args) {
	
	
	int  [][] score = {{ 98, 98, 90, 92, 99 },
			{ 81, 82, 83, 84, 85 },
			{ 71, 73, 75, 77, 79 },
			{ 60, 65, 60, 65, 69 },
			{ 77, 74, 79, 78, 72}};
	
//	int sum[][];
//	double avg[][];
	//avg = (int)sum /5;
	
	// avg = (int)sum /5;
	int sum[] = new int[5];
	double avg[] = new double[5];
	
	
	
	for (int i = 0; i <= score.length; i++) {
		
	
		for (int j = 0; j < score[i].length; j++) {
//			int sum[5][5];
//			double avg[5][5];
			sum[i] += score[i][j];
			avg[i] += (sum[i]/5);
			
		
			
			
			
			
		}
		System.out.println(sum[i]+"\t"+avg[i]);
	}
	

	
	
	
	
}
}
