package Conditions;

public class BasicIf05 {

	public static void main(String[] args) {
		
	int number=50;
	if(number%2==0) {
	System.out.println("given no is even");
	}else {
	System.out.println("given no is odd");
	}
	
	checkEvenOddNumber(120);
	checkEvenOddNumber(300);
	checkEvenOddNumber(160);
	checkEvenOddNumber(225);
	checkEvenOddNumber(145);
	System.out.println("given no is even?:"+checkEvenOdd2(240));
	checkNumber();
	
	
	}
	
	

	static void checkEvenOddNumber(int num) {
	if (num%2==0) {
	System.out.println("given no is even:"+num);
	}else {
	System.out.println("given no is odd:"+num);
	}
	}
	
	static boolean checkEvenOdd2(int num) {
	if(num%2==0) {
	return true;
	}
	else
	{
	return false;
	}
	}
	
	
	
	static void checkNumber() {
	int num=50;
	if(num%2==0) {
	System.out.println("number is even:"+num);
	}else {
	System.out.println("number is odd:"+num);
	}
	}
	}

	
	
