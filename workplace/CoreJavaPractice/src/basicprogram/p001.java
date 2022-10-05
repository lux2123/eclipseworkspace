package basicprogram;

class Demo{//parent class
	Demo(int a){
		System.out.println("i am para cons");
	}
	void callme() {
		System.out.println("i am callme");
}				
	static void disply() {
			
	System.out.println("i am display ");
	}
}
class Demo2 extends Demo{ //child class
Demo2(){
		super(40);
		System.out.println("i am super para cons");
	}
	void calling() {
		System.out.println("i am calling");
	}
	static void displying() {
		System.out.println("i am displying");
	}
	
}
class Demo3 extends Demo2{
	
void calling() {
	super.calling();
	System.out.println("i am calling demo3");
}
}


public class p001 {

	public static void main(String[] args) {
		
		Demo3 m=new Demo3();
		m.callme();
		m.calling();
	
		


	}

}
