package abstracts;

abstract class bike{
	abstract void run();
	void speed(int speed) {
		System.out.println("non abstract method speed:"+speed);
	}
}

class Honda extends bike{
	void run() {
		System.out.println("run");
	}
	void speed(int speed) {
		System.out.println("speed:"+speed);
		super.speed(20);
	}
	void color() {
		System.out.println("color");
	}
}

public class abstract02 {

	public static void main(String[] args) {
		 bike obj=new Honda();
		 obj.run();
		 obj.speed(120);
		 Honda obj1=new Honda();
		 obj1.color();

	}

}
