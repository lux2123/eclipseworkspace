package inheritances;
class A{
	static int a=12;
	int b=13;
	double c=20.30;
	}
	
	class B{
	static int x=12;
	int y=34;
	double z=46;
	}
	
	class C{
	static int p=60;
	int q=40;
	double r=30;
	}

public class Inheritance01 {
	

	public static void main(String[] args) {
		
		// access static members class A members
		System.out.println("class A static variable:"+A.a);
		//access static member of class B members
		System.out.println("class B static variable:"+B.x);
		//access static member class C members
		System.out.println("class C static variable:"+C.p);
		System.out.println("********************access all non static members************");
		A a1=new A();
		System.out.println(a1.b);
		System.out.println(a1.c);
		System.out.println("************access class B non static members**********");
		B b1=new B();
		System.out.println(b1.y);
		System.out.println(b1.z);
		System.out.println("**************access class C non static members****************");
		C c1=new C();
		System.out.println(c1.q);
		System.out.println(c1.r);
	}
}
		
		
		
		

	

