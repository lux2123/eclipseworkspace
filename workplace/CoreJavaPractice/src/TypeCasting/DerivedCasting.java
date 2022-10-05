package TypeCasting;
class GrandParent{
	void myHome() {
		System.out.println("Home belongs to GrandParent");
		
	}
}
class Parent extends GrandParent{
	//function
	void show() {
		System.out.println("parent show method is called");
	}
	void callme() {
		System.out.println("parent callme method is called");
	}
}
class child extends Parent{
	void readme() {
		System.out.println("child readme method is called");
	}
}

public class DerivedCasting {

	public static void main(String[] args) {
		System.out.println("************************Ref and object both of child***********************");
		//object of child class and reference of child class
		child d=new child();
		d.readme();
		d.callme();
		d.show();
		d.myHome();
		
		System.out.println("*************************Ref and object bothh of parent*********************");
		//object of parent class and reference of parent class
		
		Parent p=new Parent();
		p.show();
		p.callme();
		p.myHome();
		
		System.out.println("***************************Ref and object both of Grandparent *******************");
		
		GrandParent g=new GrandParent();
		g.myHome();
		
		System.out.println("******************Ref parent and object child************************");
		//creating a parent class object but reference it to a child class
		Parent obj=d;//auto up/implicit up Casting--->parent obj=d=new child();--->parent obj=new child();		
		
		obj.show();
		obj.callme();
		obj.myHome();
		
		System.out.println("**************************Ref Grandparent and object of child*******************");
		
		GrandParent obj1=d;//auto-up/implicit up casting-->Grandparent GrandParent obj=d=new child();
		//GrandParent obj1=new child();
		obj1.myHome();
		
	}

}
