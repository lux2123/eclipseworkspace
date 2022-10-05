package superKeword;

class A4{
	A4(int a){
		System.out.println("intigr");
	}
}

class B4 extends A4{
	B4(double b){
		super(20);
		System.out.println("double ");
	}
}

class C4 extends B4{
	C4(){
		super(10.4);
		System.out.println("non para");
	}
	
}
public class superkey05 {

	public static void main(String[] args) {
	C4 c=new C4();
	

	}

}
