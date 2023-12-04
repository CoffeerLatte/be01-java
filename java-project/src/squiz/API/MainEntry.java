package squiz.API;

public class MainEntry {
public static void main(String[] args) {
	int h;
	
	String str = "abcDEFGHeijwEIMPYmnqr";
	

	char ch;
	h = str.length();
	
	
	for (int i = 0; i < h; i++) {
		
		
		
		
		
		
		
		if(str.charAt(i) >= 65 && str.charAt(i) <=90)
		{
			ch = str.charAt(i);
			ch += 32;
			System.out.print(ch);
		}
		else if ((str.charAt(i) >= 97 && str.charAt(i) <=122)) {
			ch = str.charAt(i);
			ch -= 32;
			System.out.print(ch);
		}
		
	}
			
}

}