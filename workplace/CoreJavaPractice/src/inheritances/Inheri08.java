package inheritances;

class fruitA{
int fruitAge;
fruitA(){
System.out.println("fruitA class cons");
fruitAge=7;
}
public void taste() {
System.out.println("fruits are sweet");
}
}

class mango extends fruitA{
int fruitAge;
mango(){
System.out.println("mango class cons");
fruitAge=5;
}
public void taste() {
	System.out.println("mango are tart in taste");
}
public void shape() {
	System.out.println("mango is round");
	}
}

public class Inheri08 {

	public static void main(String[] args) {
		mango fr=new mango();
		fr.taste();
		fr.shape();
		
		System.out.println(fr.fruitAge);
		
		fruitA f1=new fruitA();
		f1.taste();
		
		System.out.println(f1.fruitAge);
	
		
		

	}

}
