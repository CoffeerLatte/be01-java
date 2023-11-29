package quizInheritance;
import java.util.*;


public class Saraam {
	
		Scanner sc = new Scanner(System.in);
		
		
		private String name, gender;
		private int age;
		
		
		
		
		
		
		protected Saraam() {
		int  age;
		String name, gender;	
		
		
			
			input();
				
				
			
			
		}
		
		
		
		private void input() {
			
			System.out.println("이름은? ");
			setName(sc.next());
			System.out.println("성별은? ");
			setGender(sc.next());
			System.out.println("나이는? ");
			setAge(sc.nextInt());
			
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		public void dp() {
			System.out.println("이름은: "+name);
			System.out.println("성별은: "+gender);
			System.out.println("나이는: "+age);
			
			
		}
		
		
		
		
		
}
