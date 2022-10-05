package Constructors;
public class Cons14 {
double i=10.5;
Cons14(double j){
System.out.println("this is user defined constructor");
i=j;
}


	

	public static void main(String[] args) {
		Cons14 c2=new Cons14(11.5);
		System.out.println(c2.i);
		System.out.println("******************************");
		Cons14 c3=new Cons14(30.5);
		System.out.println(c3.i);
		c3.i=230.5;
		System.out.println(c3.i);
				
		

	}

}


