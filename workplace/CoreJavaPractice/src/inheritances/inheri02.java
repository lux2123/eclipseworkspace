package inheritances;

class x1{
static int a=10;
int b=20;
double c=13.45;

}

class x2 extends x1{
static int x=30;
int y=40;
double z=40.60;
}

class x3 extends x2{
static int p=40;
int q=48;
double r=50.7;
}

public class inheri02 {
	
	public static void main(String[] args) {
	System.out.println(x1.a);
	System.out.println(x2.x);
	System.out.println(x3.p);
	
	x1 c1=new x1();
	System.out.println(c1.b);
	System.out.println(c1.c);
	
	x2 c2=new x2();
	System.out.println(c2.y);
	System.out.println(c2.z);
	
	x3 c3=new x3();
	System.out.println(c3.q);
	System.out.println(c3.r);
	
	System.out.println("*********************all non static member of class A1 B1**************************");
	B1 b1=new B1();
	System.out.println(b1.b);
	System.out.println(b1.c);
	System.out.println(b1.y);
	System.out.println(b1.z);
	
	
	
	
	

	}

}
