package superKeword;
class A2{
	A2(){
		System.out.println("zero parameter");
	}
	A2(int a, double b){
		System.out.println("int double parameter");
	}
	
}

class B2 extends A2{
	B2(int a){
		//super(10,20.10);
		System.out.println(" int single parameter:" +a);
	}
}

public class superkey04 {

	public static void main(String[] args) {
		B2 b=new B2(10);
		
		

	}

}
