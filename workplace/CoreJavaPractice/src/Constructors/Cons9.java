package Constructors;

class S{
	int i=10;
	S(){
	System.out.println("constructor class A");
	}
	void display() {
	System.out.println("i am display of class A");
	}
	}
class F {
	int j=10;
	F(){
	System.out.println("constructor class X");
	}

	void display() {
	System.out.println("i am display of class x");
	}
}
    class Abc{
    	
    void display() {
    System.out.println("i am display of class Cons5");
    }
    }


public class Cons9 {
	
	public static void main(String[] args) {
		A a1=new A();
		a1.display();
		System.out.println("global variable of i="+a1.i);
		X x2=new X();
		x2.display();
		System.out.println("global variable of j="+x2.j);
		Abc c1=new Abc();
		c1.display();
	}

	}


