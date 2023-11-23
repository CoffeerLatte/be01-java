package day04_control.BreakContinue;

public class MainEntry {



public static void main(String[] args) {
		
	for (int i = 1; i <= 10; i++) {
		if(i == 7)
		
			break;
		System.out.println(i);
		
	}
	System.out.println();
		for (int i = 1; i < 11; i++) {
			if (i ==7)  continue;
			System.out.println(i);
		}
		
		System.out.println();
	for (int i = 0; i < 11; i++) {
		if(i%2 ==0 )
			System.out.println(i);
		
	}
}



}
