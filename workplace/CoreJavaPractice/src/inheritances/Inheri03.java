package inheritances;

class fruit{
fruit(){
	System.out.println("fruit class cons");
}

public void taste() {
System.out.println("fruits are sweet");
}
}
//child class of fruit

class apple extends fruit{
	apple(){
	System.out.println("apple class cons");
	}
	
	public void shape() {
	System.out.println("Apple is round");
	}
}



public class Inheri03 {

	public static void main(String[] args) {
		apple fr=new apple();//object of child class
		fr.taste();//method of parent class
		fr.shape();	//method of child class	
				

	}

}
