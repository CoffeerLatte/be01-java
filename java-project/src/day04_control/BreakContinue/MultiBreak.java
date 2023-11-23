package day04_control.BreakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		
		
		boolean t = true;
		
		first : {
			Second : {
				Third : {
					int k = 100;
					
					System.out.println("Before the Break"); //1
					if(t) break Second;
					
					System.out.println("This won't execute");	//2
					
					
					
					
				} // Third end
			System.out.println("123");
			} // second end
		System.out.println("This is after second block");  //4
		} 	// first end
	}
}
