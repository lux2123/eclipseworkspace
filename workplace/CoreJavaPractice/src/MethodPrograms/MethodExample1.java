package MethodPrograms;

public class MethodExample1 {
	
	/**
	// * simple interest: roi = (P*r*t)/100;
	 * 
	 */
	public static double getROI() {
	int p=30000, t=2;
	float r=3.5f;
	double roi=(p*r*t)/100;
	System.out.println("principle amount is:"+p);
	System.out.println("roi is:"+r);
	System.out.println("duration is:"+t);
	System.out.println("interest paid by:"+roi);
	return roi;
	
	}
	public static double getROI(int p, int t, float r) {
		double roi=(p*r*t)/100;
		System.out.println("principle amount is:"+p);
		System.out.println("roi is:"+r);
		System.out.println("duration is:"+t);
		System.out.println("interest paid by:"+roi);
		return roi;
	}
	public static void main(String[] args)
	{
	System.out.println("program start");
	getROI();
	System.out.println("**************Using Parameters*******************");
	getROI(35000,3,4.5f);
	getROI(45000,2,6.5f);
	int amount=58500;
	System.out.println("************************************************");
	double interest =getROI(amount,2,6.5f);
	double finalvalue=amount+interest;
	System.out.println("interest paid by you:"+finalvalue);

	System.out.println("program end");
		
		
		
	}
	
}





