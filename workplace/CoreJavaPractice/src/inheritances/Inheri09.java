package inheritances;
//parent class
class company{
	void display() {
		System.out.println("i am company class display");
	}
}
//child class of company
class Employee202 extends company{
	void display() {
		System.out.println("i am employee class display");
		super.display();
		
	}
	void callme() {
		System.out.println("i am employee class callme");
	}
}

public class Inheri09 {

	public static void main(String[] args) {
		Employee202 e1=new Employee202();
		e1.display();
		e1.callme();
		
		System.out.println("************************************");
		company c1=new company();
		c1.display();
		
		System.out.println("**********************************");
		company c2=new Employee202();
		c2.display();		

	}

}

