package Interface;

interface key{
	void display();
}
interface keychain extends key{
	void run();
}

public class Interface05 implements keychain{
	public void display() {
		System.out.println("hello");
	}
	public void run() {
		System.out.println("welcome");
	}

	public static void main(String[] args) {
		Interface05 i=new Interface05();
		i.display();
		i.run();
		key k=new Interface05();
		k.display();
		
		
		

	}

}
