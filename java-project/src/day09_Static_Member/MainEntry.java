package day09_Static_Member;


class atm {
	int	 count;	 // instance member
	
	static int total;	// static member;
	public	atm(int amount) {
		count += amount;
		total += amount;
	}
	
	
	public void display() {
		System.out.println("count = "+ count);
		System.out.println("total = "+ total);
	}
	public static void view() {
		
	}
}
	



public class MainEntry {
public static void main(String[] args) {
	
	atm at = new atm(1000);
	
	at.display();
	atm at2 = new atm(1000);
	
	at.display();
atm at3 = new atm(1000);
	
	at.display();
}
}
