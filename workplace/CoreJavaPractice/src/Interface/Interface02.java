package Interface;

interface bank{
	float rateofInterest();
}
class SBI1 implements bank{
	public float rateofInterest() {
		return 23.5f;
	}
}
class RBI1 implements bank{
	public float rateofInterest() {
		return 34.6f;
	}
}

public class Interface02 {

	public static void main(String[] args) {
		SBI1 s=new SBI1();
		System.out.println("SBI:"+s.rateofInterest());
		RBI1 r=new RBI1();
		System.out.println("RBI:"+r.rateofInterest());
		bank b=new SBI1();
		System.out.println("bank to sbi:"+b.rateofInterest());
		

	}

}
