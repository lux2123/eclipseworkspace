package Conditions;

public class IfCondition2 {
	
	

	public static void main(String[] args) {
		
		checkEvenOddNumber(50);
		checkEvenOddNumber(45);
		checkEvenOddNumber(117);
		
         System.out.println("is given number is:"+eNumber(50));
		 System.out.println("is given number is:"+eNumber(40));
		 checkEvenOddNumber2();
		 
		int number=55;
		if(number%2==0) {
		System.out.println("even number");
		}else {
		System.out.println("odd number");
		}
	}
	
	
	static void checkEvenOddNumber(int num) {
	if (num%2==0){
		System.out.println("given number is even:"+num);
	}
	else {
		System.out.println("given number is odd:"+num);
	}
	
	}
	
	 static boolean eNumber(int num) {
		if(num%2==0) {
		return true;
		}else {
		return false;
		}
	 }
		static void checkEvenOddNumber2() {
		int num=50;
		if(num%2==0) {
		System.out.println("given number is even:"+num);
		}else {
		System.out.println("given number is odd:"+num);
		}
		
		
		

	}
		
	 }


