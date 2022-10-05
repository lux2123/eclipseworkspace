package Conditions;

public class practice {

	public static void main(String[] args) {
		int num1=30,num2=40;
		if(num1>20 && num2>50) {
			System.out.println("condition pass");
		}
		else
		{
			System.out.println("condition fail");
		}

	practice(40);
	practice(60);
	practice(50);
	
	
	System.out.println("is given no is true or false:"+isNumberEven(78));
	
	}
        
	static void practice(int num) {
		if(num%2==0) {
			System.out.println("even:"+num);
		}
		else
		{
			System.out.println("odd:"+num);
		}
		
		
		
	
	
	}
	static boolean isNumberEven(int num) {
		if(num%2==0) {
			return true;
		}
		else
		{
		return false;
		}
		
		
	}
}
