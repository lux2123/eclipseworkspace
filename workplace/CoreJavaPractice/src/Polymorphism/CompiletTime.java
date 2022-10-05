package Polymorphism;


public class CompiletTime {
	static void sum(int a, int b) {
		int c=a+b;
		System.out.println("Addition of two number:"+c);
	}
	static void sum(int a, int b, int e) {
		int c=a+b+e;
		System.out.println("Addition of three number:"+c);
	}

	public static void main(String[] args) {
		CompiletTime.sum(45,80,22);
		//CompiletTime.sum(30,40);
		/**when a method get to know its implementation at the time of compilation is known as compile
		 * time poly this can be achieved by using static method overloading.
		 */
		

	}

}
