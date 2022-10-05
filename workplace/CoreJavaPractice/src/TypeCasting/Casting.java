package TypeCasting;
class Parent100{
	void myHome() {
		System.out.println("parent home");
	}
}
class child100 extends Parent{
	void myCar() {
		System.out.println("child car");
	}
}

public class Casting {

	public static void main(String[] args) {
		child100 c1=new child100();
		c1.myCar();
		c1.myHome();
		Parent100 p1=new Parent100();
		p1.myHome();
		
		System.out.println("*******************************Using Upcasting*******************");
		//using casting concept
		child100 c3=new child100();
		c3.myCar();
		c3.myHome();
		Parent100 c4=c3;//auto upcasting
		c4.myHome();
		
		

	}

}
