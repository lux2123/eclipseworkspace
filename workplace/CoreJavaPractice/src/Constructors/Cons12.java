package Constructors;

public class Cons12 {
	int age;
	double salary;
	
	Cons12(){
	System.out.println("user defined constructor zero parameter starts");
	age=20;
	salary=235.00;
	System.out.println(" user defined constructor zero parameter ends");
	}

	public static void main(String[] args) {
	Cons12 c1=new Cons12();
	System.out.println(c1.age);
	System.out.println(c1.salary);
	

	}

}