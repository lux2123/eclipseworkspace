package abstracts;

abstract class demo{//50% abstract
	abstract void print();
	void display() {
		System.out.println("i am non abstract method display");
	}
}
abstract class demo2{//0% abstract
	void display1() {
		System.out.println("i am non abstract method display1");
	}
	void display2() {
		System.out.println("i am non abtract method display2");
	}
}

abstract class demo3{//100% abstract
	abstract void print();
	abstract void print1();
	abstract void print2();
}
abstract class demo4{
	abstract void print1();
}

  class train extends demo4{
	void print1() {
		
	}
	 
		 
	 }

public class abstract01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
