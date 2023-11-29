package quizInheritance;

public class Saraam {

		protected String name, gender;
		protected int age;
		
		public Saraam() {
			
			name = "전승민";
			gender = "남자";
			age = 26;
			
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
			System.out.println("이릉: "+name+"\n"+"성별: "+gender+"\n"+"나이: "+age);
			
		}
		
}
