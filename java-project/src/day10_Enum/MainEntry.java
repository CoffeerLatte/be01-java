package day10_Enum;

public class MainEntry {
	public static void main(String[] args) {
		
		EnumTest et = new EnumTest(Day.Monday);
		et.t1();
		EnumTest at = new EnumTest(Day.Tuesday);
		at.t1();
		EnumTest ct = new EnumTest(Day.Friday.Wednesday);
		ct.t1();
		
	
}
}
