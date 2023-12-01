package day10_Enum;


enum Day {
	Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
}



public class EnumTest {
	Day day1;
	
	public EnumTest(Day day1) {
		this.day1 = day1;
		
	}
	
	public void t1() {
		
		switch (day1) {
		case Monday:
			System.out.println("월요일");
			break;
		case Tuesday:
			System.out.println("화요일");
			break;
		case Wednesday:
			System.out.println("수요일");
			break;
		default:
			System.out.println("월화수 제외한 요일");
			break;
		}
	}
}
