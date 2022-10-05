package Constructors;

public class Cons18 {
	static int age;
	int salary;
	int empId=233;
	void display(int salary) {

	System.out.println("age:"+salary);
	System.out.println("age:"+this.salary);
	this.salary=4000;
	}

	public static void main(String[] args) {
		int age=25;
		System.out.println("age:"+age);
		System.out.println(":"+Cons18.age);
		int salary=34000;
		
		
		

	}

}
