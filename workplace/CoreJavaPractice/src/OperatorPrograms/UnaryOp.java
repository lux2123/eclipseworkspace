package OperatorPrograms;

public class UnaryOp {

	public static void main(String[] args) {
	int a=0, b;
	b= a++ + ++a + ++a + a;
	System.out.println(a);
	System.out.println(b);
	
	a=0;
	b= a-- + --a + --a + a;
	System.out.println(a);
	System.out.println(b);
	
	a=0;
	b= --a + --a + --a + a + ++a +a++;
	System.out.println(a);
	System.out.println(b);
	
	a=0;
	b= a-- + a + ++a + a++ + ++a + a++ + a;
	System.out.println(a);
	System.out.println(b);
	}

}
