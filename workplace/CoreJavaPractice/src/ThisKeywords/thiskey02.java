package ThisKeywords;

class A{
	void m() {
		System.out.println("hello m");
	}


	void n() {
		
		System.out.println("hello n");
		m();
		
	}
}

public class thiskey02 {
	void methodone() {
		System.out.println("inside method one");
		methodtwo();
	}
	
	void methodtwo() {
		System.out.println("inside method two");
		//methodone();	
		}

	public static void main(String[] args) {
	A a=new A();
	a.n();
	thiskey02 t=new thiskey02();
	//t.methodtwo();
	t.methodone();
		

	}

}
