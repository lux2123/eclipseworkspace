package VariablePrograms;

public class StaticAndNonStaticExample1 {
	static int age;
	double salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("default value age is:"+age);
age=30;
System.out.println("updated value of age is:"+age);
System.out.println("*********************************");

StaticAndNonStaticExample1 a=new StaticAndNonStaticExample1();
System.out.println("salary is:"+a.salary);
a.salary=9000;
System.out.println("updated salary is:"+a.salary);
System.out.println("*************************************");

StaticAndNonStaticExample1 b=new StaticAndNonStaticExample1();
System.out.println("default salary is:"+b.salary);
b.salary=59000;
System.out.println("updated salary is:"+b.salary);

System.out.println("**********************************");

StaticAndNonStaticExample1.age=40;
System.out.println("updated value age is:"+StaticAndNonStaticExample1.age);



	}

}
