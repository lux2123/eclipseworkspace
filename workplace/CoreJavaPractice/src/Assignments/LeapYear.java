package Assignments;

public class LeapYear {
	
       public static void main(String[] args) { 
		int year=2000;
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Non leap year");
		}
		
		leap(4000);
		leap(2000);
		leap(1900);
		leap(1950);
	
		System.out.println("leap year true or false?:"+leap1(1995));
	}
       static void leap(int year) {
    	   if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
    		   System.out.println("leap year:"+year);
    	   }
    	   else
    	   {
    		   System.out.println("non leap year:"+year);
    	   }
    	   
       }
       
       static boolean leap1(int year) {
    	   if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
    		   return true;
    	   }
    	   else
    	   {
    		   return false;
    	   }
    	   
       }
}

