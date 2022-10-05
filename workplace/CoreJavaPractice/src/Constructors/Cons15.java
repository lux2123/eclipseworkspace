package Constructors;

public class Cons15 {
	int i=13;
	Cons15(int x)
	{
	System.out.println("userdefined zero para");
	i=x;
	}
	

	public static void main(String[] args) {
	Cons15 c1=new Cons15(120);
	System.out.println(c1.i);
	Cons15 c3=new Cons15(130);
	System.out.println(c3.i);
	
	

	}

}
