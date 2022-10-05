package Interface;

interface mango{
	void run();
}
interface banana{
	void run();
}

public class Interfce04 implements mango,banana{ 
	public void run() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		Interfce04 i=new Interfce04();
		i.run();

	}

}
