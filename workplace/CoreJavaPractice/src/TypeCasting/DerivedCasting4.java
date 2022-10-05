package TypeCasting;
class JD{
	public void printMe1() {
		System.out.println("journalDev print method");
	}
	void disp() {
		System.out.println("journalDev disp method");
	}
}
//Inheited class
class Java extends JD{
	public void printMe2() {
		System.out.println("java disp method");
	}
	void disp() {
		System.out.println("java disp method");	
	}
}
class Android extends Java{
	public void printMe3() {
		System.out.println("Android print method");
	}
	void disp() {
		System.out.println("Android disp method");
	}
}
public class DerivedCasting4 {

	public static void main(String[] args) {
		JD j=new Android();
		j.printMe1();
		j.disp();
		
		System.out.println("****************************downcasting to java*************************");
		
		Java j1=(Java)j;
		j1.printMe1();
		j1.printMe2();
		j1.disp();
		
		System.out.println("****************downcasting to android****************************");
		Android a1=(Android)j1;
		a1.printMe1();
		a1.printMe2();
		a1.printMe3();
		a1.disp();
		
		
		
				

	}

}
