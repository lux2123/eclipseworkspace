package Interface;

interface printable{
	int age=25000;
	void run();
}
interface showable{
	void print();
}

public class Interface03 implements printable,showable{
	public static int age=34000;
	public void run() {
		System.out.println("hello print");
		

}
	public void print() {
		System.out.println("hello showable");
	}
	public static void main(String[] args) {
		Interface03 i=new Interface03();
		i.run();
		i.print();
		System.out.println(printable.age);
		System.out.println(Interface03.age);
		

	}

}
