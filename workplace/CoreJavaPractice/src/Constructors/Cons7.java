package Constructors;

public class Cons7 {
	int roll;
	double salary;
	
	Cons7(int r, double s)
	{
	roll=r;
	salary=s;
	}
	void display() {
	System.out.println(roll+" "+salary);
	}

	public static void main(String[] args) {
		Cons7 c2=new Cons7(20,20.5);
		c2.display();
		Cons7 c3=new Cons7(30,30.5);
		c3.display();
		

	}

}
