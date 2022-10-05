package Conditions;

public class BasicIf06 {

	public static void main(String[] args) {
	int year=2000;
	if(((year%4==0)&&(year%100!=0)) ||(year%400==0)){
	System.out.println("leap year");
	}else {
	System.out.println("common year or non leap year");
	}
	
	leapYear(2022);
	leapYear(2023);
	leapYear(1995);
	leapYear(2004);
	
	leapYear2();
	System.out.println("given year is:"+checkYearLeap(1992));
	}

	

     static void leapYear(int year) {
    if(((year%4==0)&&(year%100!=0))||(year%200==0)) {
    System.out.println("given year is leap year:"+year);
    }else {
    System.out.println("given year is non leap year:"+year);
    }
     }

     
     
     static void leapYear2() {
    int year=2030;
    if(((year%4==0)&&(year%100!=0))||(year%200==0)) {
    System.out.println("given year is leap:"+year);
    }else {
    System.out.println("given year is not leap:"+year);
    }
     }
     
     static boolean checkYearLeap(int year){
    if(((year%4==0)&&(year%100!=0))||(year%200==0)) {
    System.out.println("leap year");
    return true;
    }else {
    System.out.println("comom year or non leap year");
    return false;
    }
     }
    
    	 
    
     }

