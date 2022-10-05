package Polymorphism;
class Bank{
	float getRateofInterest() {
		return 0;
	}
}
class SBI extends Bank{
	float getRateofInterest() {
		return 8.4f;
	}
}
class ICICI extends Bank{
	float getRateofInterest() {
		return 7.3f;
	
		
	}
}
class AXIS extends Bank{
	float getRateofInterest() {
		return 9.7f;
	}
}

public class PolyRuntime4 {

	public static void main(String[] args) {
		Bank b=new SBI();//Upcasting
		System.out.println("SBI rate of Interest:"+b.getRateofInterest());
		b=new ICICI();//upcasting 
		System.out.println("ICICI rate of Interest:"+b.getRateofInterest());
		b=new AXIS();
		System.out.println("AXIS rate of Interest:"+b.getRateofInterest());
		
		
		

	}

}
