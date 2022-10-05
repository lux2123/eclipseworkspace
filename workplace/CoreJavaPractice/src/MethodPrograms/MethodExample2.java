package MethodPrograms;

public class MethodExample2 {
	
	public static double getROI(int p, int t, float r) {
	double roi=(p*r*t)/100;
	System.out.println("principle is:"+p);
	System.out.println("roi is:"+r);
	System.out.println("time is:"+t);
	System.out.println("interest paid by:"+roi);
	return roi;
		
	}
	
	public static void iGet() {
	int p=20000,t=2;
	float r=4.5f;
	double roi=(p*r*t)/100;
	System.out.println("principle amount is:"+p);
	System.out.println("ROI is:"+r);
	System.out.println("duration is:"+t);
	System.out.println("interest paid by you:"+roi);
	
	}
	    public static void main(String[] args) {
		getROI(45000,3,4.5f);
		getROI(35000,2,3.5f);
		getROI(25000,3,4.6f);
		int amount=3450;
		double interest=getROI(amount,3,4.5f);
		double finalAmount=amount+interest;
		System.out.println("total amount paid by you:"+finalAmount);
		System.out.println("*****************************************");
		
		iGet();
		
		// TODO Auto-generated method stub

	}

}
