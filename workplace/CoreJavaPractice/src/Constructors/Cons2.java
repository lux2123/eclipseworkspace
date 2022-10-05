package Constructors;

public class Cons2 {
	Cons2()
	{
	System.out.println("this is a Zero parameter constructor");	
	}
	Cons2(int num1, int num2)
	{
	System.out.println("this is int int parameterized constructor");
	}
	Cons2(char c)
	{
	System.out.println("this is single para constructor");
	}
	Cons2(double num)
	{
	System.out.println("this is double parameter");
	}

	public static void main(String[] args) {
		Cons2 c1=new Cons2();
		Cons2 c2=new Cons2('A');
		Cons2 c3=new Cons2(10,29);
		Cons2 c4=new Cons2(10.5);


	}

}
