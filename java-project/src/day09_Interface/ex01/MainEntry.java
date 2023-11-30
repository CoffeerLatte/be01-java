package day09_Interface.ex01;

import day09_Abstract.ex02.Shape;

interface A {
	
	int x = 9;			// 추상 메소드와 상수만을 갖는다.		<- int 앞에 final이 생략된 것이다.
	
	public void show(); 		// abstract가 생략된 것. <- 모든 메소드들은 추상 메소드이다.==> 결국 추상이면 블럭이 없다. 블럭(바디) -> {}
	
	
	public abstract void sp();
	public int st(int x, int y);
}





interface B {
	
	void bView();
	
	
	
}	// b end


interface C {
	
	String name = "전승민";			// --> 늬워진 글자는(이태리) final이 포함된 명령어고 상수이기때문에 변수를 바꿀 수 없다. + 초기값을 안들고 오면 에러발생.
	public void draw();
	
	
}



interface D extends B {
	
	void dView();
	
	
}



class Rect implements C{

	@Override
	public void draw() {
			System.out.println("======="+ name + " 반갑습니다.");
	}
	
}




class Multi extends Shape implements B, C, A {

	@Override
	public void show() {
		System.out.println("A");
	}

	@Override
	public void sp() {
System.out.println("display ");		
	}

	@Override
	public int st(int x, int y) {
		
		
		System.out.println("plus call");
		
		return 222;
	}

	@Override
	public void draw() {
		System.out.println("draw call");
	}

	@Override
	public void bView() {
		System.out.println("bView call");
	}

	@Override
	public double calc(double x, int y) {
		
		
		Rect r = new Rect();
		r.draw();
		
		
		return 0;
	}

	@Override
	public void show(String name) {
		System.out.println("showcall " );
		
	}
	
	
}

























// main entry 
public class MainEntry {
 int x,y;
 double z;
 
		public static void main(String[] args) {
			MainEntry m = new MainEntry();
			
			Rect r  = new Rect();									//자기 자신으로 객체 생성
			
			r.draw();
			
			C rr = new Rect();										// 부모 C 인터페이스로 객체 생성
			
			rr.draw();
			System.out.println(rr.name);
			
			System.out.println(m.x +" " +m.y +" " +m.z);
			
			
			Multi m3 = new Multi();
			
			//((B) m).bView();
		//	((A) m).sp();
			
			Shape m2 = new Multi();
			
			m2.calc(1, 2);
			
			A m4 = new Multi();
			
			m4.show();
			
			
			
		}
}
