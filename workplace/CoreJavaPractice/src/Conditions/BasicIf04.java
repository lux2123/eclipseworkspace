package Conditions;

public class BasicIf04 {

	public static void main(String[] args) {
	int num1=40, num2=20;
	if(num1>num2) {
	System.out.println("num1 is greater than num2");
	}
	else {
	System.out.println("num1 is less than num2");
	}
	
	if(num1<num2) {
	System.out.println("num1 is greater than num2");
	}
	else {
	System.out.println("num1 is less than num2");
	}
	
	if(num1>=num2) {
	System.out.println("number1 is either equal to  num2  or greater than num2 ");
	
	}else {
	System.out.println("number1 is less than num2");
	}
	
	if(num1>num2 || num1<num2) {
	System.out.println("num1 is either greater than num2 ");
	}else {
	System.out.println("num1 is less than num2");
	}
	
	if(num1>=num2 && num1<num2) {
	System.out.println("num1 is either equal to num2 or greater than num2");
	}else {
	System.out.println("num1 is less than num2");
	
	int var1=50, var2=60;
	if(var1>30 && var2<30) {
	System.out.println("condition is true");
	}
	else{
    System.out.println("condition is false");
	}
		// TODO Auto-generated method stub
	}
	}

}
