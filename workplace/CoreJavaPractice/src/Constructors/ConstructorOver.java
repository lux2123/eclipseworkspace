package Constructors;

public class ConstructorOver {
	
	ConstructorOver(){
	System.out.println("zero parameter constructor");
	System.out.println("having no parameter");
	}
	ConstructorOver(int num){
	System.out.println("parameterized constructor");
	System.out.println("having int parameter");
	}
	ConstructorOver(double num){
	System.out.println("parameterized constructor");
	System.out.println("having double parameterized ");
	}
	ConstructorOver(int a,double b,double c){
	System.out.println("parameterized constructor");
	System.out.println("having int,double, int parameter");
	}
	
	
	

	public static void main(String[] args) {
		ConstructorOver c1=new ConstructorOver();
		ConstructorOver c2=new ConstructorOver(123);
		ConstructorOver c3=new ConstructorOver(20.5);
		ConstructorOver c4=new ConstructorOver(11,20.5,20.5);
		
		
		
		

	}

}
