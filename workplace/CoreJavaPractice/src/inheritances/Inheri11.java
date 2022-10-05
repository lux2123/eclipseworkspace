package inheritances;

class Grantfather{
Grantfather(){
System.out.println("i am class Grantfather cons");	
	}
void myHome() {
	System.out.println("i am home of grantfather");
}

class father extends Grantfather{
	father(){
		System.out.println("i am class father cons");
	}
	void myCar() {
		System.out.println("i am car of father");
	}
	
	
}
class child1 extends father{
	child1(int i)
	{
		
	System.out.println("i am calss child cons");
		
	}
	void myBike() {
		System.out.println("i am bike of child1 class");
	}
}



public class Inheri11 {
	

	public static void main(String[] args) {
		child1 c2=new child1(1);
		c2.myBike();
		
		
		System.out.println("**********************");
		father f1=new father();
		f1.myCar();
		f1.myHome();
	System.out.println("***********************************");	
		Grantfather g1=new Grantfather();
		g1.myHome();
		
	System.out.println("***********************************");	
		
		Grantfather g2=new father();
		g2.myHome();
	

}
}
}


		
		
	
	
	
	
	
