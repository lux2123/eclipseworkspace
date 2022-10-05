package MethodPrograms;

public class Method004 {
	public static int methodName1(int num1, int num2) 
	{
	System.out.println("number1 is:"+num1);
	System.out.println("number2 is:"+num2);
	int result=num1+num2;
	return result;
	}

	public static void main(String[] args) {
	methodName1(20,30);
	System.out.println("********************");
	
	int x=20,y=30;
	methodName1(x,y);
	System.out.println("*****************************");
	
	System.out.println("addition of two number is:"+methodName1(20,30));
	
	System.out.println("*****************************************************");
	System.out.println(methodName1(20,30));
	int res=methodName1(20,30);
	int finalvalue=res*50;
	System.out.println("final result:"+finalvalue);
	System.out.println("*******************************");
	
	System.out.println(methodName1(50,45));
	int a=methodName1(50,45);
	int value=a%8;
	System.out.println("final result:"+value);
	
	
;	
	


	}

}
;