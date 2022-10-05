package inheritances;

class A2 {
	void msg() {
	System.out.println("hello");
	}

}

class B2{
	void msg() {
	System.out.println("welcome");
	}
}



 class Inheri06 extends A2,B2{
	 Inheri06(){
	super();//confusion
	 }
 
	public static void main(String[] args) {
		Inheri06 obj=new Inheri06();
		obj.msg();
		
	}
 }
		
		
		
		

	


