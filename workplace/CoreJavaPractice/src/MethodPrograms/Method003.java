package MethodPrograms;

public class Method003 {
	public static void addNumber(int num1, int num2)  // int num1=10; int num2=20; | int num1=x=10; int num2=y=20;
	{
		
	System.out.println("number1 is:"+num1);
	System.out.println("number2 is:"+num2);
	int res=num1+num2;
	System.out.println("addition of two no is:"+res);
	
	
	
	}
	public static void main(String[] args) {
		//calling static method which has return type as void with directly passing parameter
		addNumber(10,20);
		//calling static method which has return type as void and passing parameter in form of variables
		int x=10,y=20;
		addNumber(x,y);
		//calling static void method from println() below statement will give compile time exception as void doesn't return any value to jvm
		
		//System.out.println(addNumber(10,20));
		
		

	}

}
