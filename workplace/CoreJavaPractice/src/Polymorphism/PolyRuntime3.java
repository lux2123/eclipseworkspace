package Polymorphism;
class car{
	int price=25000;
	void run() {
		System.out.println("running");
	}
}
class innova extends car{
	int price=50000;
	void run() {
		System.out.println("running fast at 120km");
	}
}

public class PolyRuntime3 {

	public static void main(String[] args) {
		car c=new car();
		c.run();
		System.out.println(c.price);
		//innova i=new innova();
		//i.run();
		//System.out.println(i.price);
		

	}

}
