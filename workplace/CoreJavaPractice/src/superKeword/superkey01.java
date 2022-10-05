package superKeword;

class A1{
	int a=10;
}

class B1 extends A1{
	int a=20;
	void show() {
		System.out.println("super key");
		System.out.println(a);//20 
		System.out.println(super.a);//10
		super.a=30;
		System.out.println(super.a);//30
		System.out.println(a);//20
	}
}

public class superkey01 {

	public static void main(String[] args) {
		B1 b=new B1();
		b.show();

	}

}
