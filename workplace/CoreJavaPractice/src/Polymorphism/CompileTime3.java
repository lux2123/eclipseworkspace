package Polymorphism;
class Vehicle{
	//defining a method
	void run() {
		System.out.println("Vehicle is moving");
	}
	
}
//creating a child class
class car2 extends Vehicle{
	//defining the same method as in the parent class
	void run() {
		System.out.println("car is running safely");
	}
}
public class CompileTime3 {

	public static void main(String[] args) {
		System.out.println("program starts");
		car2 c=new car2();//creating object
		c.run();
		System.out.println("progrms end");
		//Vehicle v=new Vehicle();
		//v.run();
		

	}

}
