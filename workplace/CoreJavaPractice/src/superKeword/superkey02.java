package superKeword;

class A{
	void run() {
		System.out.println("hello student");
	}
}

class B extends A{
	void run() {
		super.run();
		System.out.println("hell teacher");
	}
}
public class superkey02 {

	public static void main(String[] args) {
		B b=new B();
		b.run();

	}

}
