package basicprogram;

abstract class E1{
	abstract void manualTesting();
	void calling() {
		System.out.println("abtract ");
	}
}
abstract class E3{
	abstract void run();
}
class E2 extends E1{
	 void manualTesting() {
		 System.out.println("example");
	 }
}
class E4 extends E3{
	void run() {
		System.out.println(" run");
	}
}



public class p002{

	public static void main(String[] args) {
		E2 e=new E2();
		e.calling();
		e.manualTesting();
		
		E1 e1=new E2();
		e1.calling();
		e1.manualTesting();
		

	}

}
