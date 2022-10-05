package basicprogram;

interface sample1{
	int age=25;// public static final int age=25;
	void display();// public abstract method
	
}
interface sample2{
	void run();
}
 class exam implements sample1,sample2{
	public  void display() {
		System.out.println("i am display method");
	}
	public void run() {
		System.out.println("shree");
	}
}

public class p003 {

	public static void main(String[] args) {
	sample1 s=new exam();
	s.display();
	System.out.println(sample1.age);
	
	sample2 s1=new exam();
	s1.run();
	

	}

}
