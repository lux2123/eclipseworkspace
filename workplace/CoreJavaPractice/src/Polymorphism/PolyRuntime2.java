package Polymorphism;
class Hillstations{
	void location() {
		System.out.println("location is");
	}
	void famousfor() {
		System.out.println("famous for");
	}
}
class manali extends Hillstations{
	void location() {
		System.out.println("manali is in himachal pradesh");
	}
	void famousfor() {
		System.out.println("it is famous for hadimba temple and adventure sports");
	}
}
class Mussoorie extends manali{
	void location() {
		System.out.println("Musoorie is in Uttarakhand");
	}
	void famousfor() {
		System.out.println("it is famous for education institutions");
	}
}
class Gulmarg extends Hillstations{
	void location() {
		System.out.println("Gulmarg is in j&amp;k");
	}
	void famousfor() {
		System.out.println("it is famous for skiing");
	}
}


public class PolyRuntime2 {

	public static void main(String[] args) {
	Hillstations a=new Hillstations();
	a.location();
	a.famousfor();
	
	System.out.println("****************************************");
	Hillstations m=new manali();
	m.location();
	m.famousfor();
	
	System.out.println("********************************************");
	Hillstations mu=new Mussoorie();
	mu.location();
	mu.famousfor();
	
	System.out.println("********************************************");
	Hillstations G=new Gulmarg();
	G.location();
	G.famousfor();
	

	}

}
