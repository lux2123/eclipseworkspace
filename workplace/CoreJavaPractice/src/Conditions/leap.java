package Conditions;

public class leap {

	public static void main(String[] args) {
		int year=2000;
		if(((year % 4==0)&&(year % 100!=0)) ||(year % 400==0)){
			System.out.println("leap year");
		}
		else
		{
			System.out.println("non leap year");
		}

		leap(3000);
		System.out.println("is leap year true or false:"+leap1(5000));
	}
	
	static void leap(int year) {
		if(((year%4==0)&&(year%100!=0))||(year%400==0)){
		System.out.println("leap year:"+year);	
		}
		else
		{
			System.out.println("non leap year:"+year);
		}
	}
 static boolean leap1(int year) {
	 if(((year%4==0)&&(year%100!=0))||(year%400==0)){
		 return true;
	 }
	 else
	 {
		 return false;
	 }
	 
 }
}
