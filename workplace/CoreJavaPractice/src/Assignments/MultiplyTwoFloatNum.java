package Assignments;

public class MultiplyTwoFloatNum {
	
	//public non-static double parameter-->two float numbers
	public double multiplyTwoFloatNumber(float p, float q) {
		return p * q;
	}

	public static void main(String[] args) {
		 MultiplyTwoFloatNum mulTwoNum=new  MultiplyTwoFloatNum();
		double res= mulTwoNum.multiplyTwoFloatNumber(10.50f,12.50f);
		 System.out.println("multiply two floating point number:"+res);
		

	}

}
