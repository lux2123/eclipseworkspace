package MethodPrograms;

public class Method2 {
	public static int addNumber(int num1, int num2) {
	System.out.println("Number 1 is: " +num1);
	System.out.println("Number 2 is: " +num2);
	int result=num1+num2;
	return result;
	}
	

	public static void main(String[] args) 
	{

	System.out.println("result of two number addition: "+addNumber(10,20));
	int res=addNumber(10,20);
	int finalvalue=res*100;
	System.out.println("final result: "+finalvalue);
	
	System.out.println("result of two number addition:"+addNumber (20,30));
	System.out.println("result of two number substraction: "+addNumber(40,30));
	
	}
	
	
	
	
	
	

	}


