package abstracts;

abstract class RBIbank{
	abstract double gethomeloan();
	final void loan() {
		System.out.println("as per RBI loan");
	}
}
class SBI extends RBIbank{
	double gethomeloan() {
		return 30.5;
		}
}
class PNB extends RBIbank{
	double gethomeloan() {
		return 20.40;
	}
}
public class abstract04 {

	public static void main(String[] args) {
	PNB p=new PNB();
	System.out.println("class of PNB:"+p.gethomeloan());
	p.loan();
	SBI s=new SBI();
	System.out.println("class of SBI:"+s.gethomeloan());
	s.loan();
	RBIbank r=new PNB();
	System.out.println("class pnb:"+r.gethomeloan());
	RBIbank r1=new SBI();
	System.out.println("class sbi:"+r1.gethomeloan());
	

	}

}
