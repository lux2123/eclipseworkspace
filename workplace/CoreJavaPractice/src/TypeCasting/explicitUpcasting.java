package TypeCasting;
class A{
	void test1() {
		System.out.println("running test1()");
	}
}
class B extends A{
	void test2() {
		System.out.println("running test2()");
	}
}
class c extends B{
	void test3() {
		System.out.println("running test3()");
	}
}

public class explicitUpcasting {

	public static void main(String[] args) {
		System.out.println("program starts");
		c c1=new c();
		//B b1=(B)c;//B b1=(B)c1-->B
		//b1=(B)new c()-->;explicite up-casting
		//or
		//B b1=new c();//implicit/auto up casting
		B b1=new c();
		b1.test1();
		b1.test2();
		//b1.test3();
		System.out.println("program ends");
		

	}

}
