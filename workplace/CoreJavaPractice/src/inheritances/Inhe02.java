package inheritances;



class frut{
	frut(){
		System.out.println("sweet frut");
	}
	public void money() {
		System.out.println("money power");
	}
	
}

class orang extends frut{
	orang(){
		System.out.println("citrus frut");
	}
	public void key() {
		System.out.println("hey");
	}
	
}

public class Inhe02 {

	public static void main(String[] args) {
	orang obj=new orang();
	//obj.money();
	//obj.key();

	}

}
