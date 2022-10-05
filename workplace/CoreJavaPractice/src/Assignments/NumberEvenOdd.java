package Assignments;

public class NumberEvenOdd {
	
	static void checkevenOdd(int num) {
		if(num%2==0) {
			System.out.println("even number:"+num);
		}
		else
		{
			System.out.println("odd number:"+num);
		}
	}
	
	static boolean evenOdd(int num) {
		if(num%2==0) {
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		checkevenOdd(50);
		checkevenOdd(33);
		checkevenOdd(28);
		checkevenOdd(70);
		
		System.out.println("even odd number true or false?:"+evenOdd(65));
		
			
		}

	}


