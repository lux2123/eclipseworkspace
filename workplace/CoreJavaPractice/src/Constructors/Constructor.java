package Constructors;

public class Constructor {
	 static int age=25;
	 int empId=123;
	void display() {
	int empId=24;
	System.out.println("empid:"+empId);//24
	System.out.println("NSGV:"+this.empId);//123
	}

	public static void main(String[] args) {
	int age=29;
	System.out.println("age:"+age);
	System.out.println("SGV:"+Constructor.age);
	Constructor c1=new Constructor();
	c1.display();
			


	}

}
