package Constructors;

public class Cons17 {
	 int age;
	double salary;
	Cons17(){
		System.out.println("zero parameter constructor");
		System.out.println("having no parameter");
		}
		Cons17(int num){
		System.out.println("parameterized constructor");
		age=num;
		System.out.println("having int parameter");
	
		}
		Cons17(double num){
		System.out.println("parameterized constructor");
		salary=num;
		System.out.println("having double parameterized ");
		}
		Cons17(int a,double b){
		System.out.println("parameterized constructor");
		System.out.println("having int,double, ");
		age=a;
		salary=b;
		}
		
		
		

		public static void main(String[] args) {
			Cons17 c1=new Cons17();
			System.out.println(c1.age);//0
			System.out.println(c1.salary);//0.0
			Cons17 c2=new Cons17(123);
			System.out.println(c2.age);//123
			System.out.println(c2.salary);//0.0
			Cons17 c3=new Cons17(23.5);
			System.out.println(c3.age);//0
			System.out.println(c3.salary);//23.5
			Cons17 c4=new Cons17(12,25.5);
			System.out.println(c4.age);//12
			System.out.println(c4.salary);//25.5
			
			
			
			

		}

	

	}


