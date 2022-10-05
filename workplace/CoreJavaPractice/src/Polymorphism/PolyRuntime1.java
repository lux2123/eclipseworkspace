package Polymorphism;
class Animal{
	void eat() {
		System.out.println("Animals eats");
	}
}
class herbivores extends Animal{
	void eat() {
		System.out.println("Herbivores eat plants");
	}
}
class omnivores extends herbivores{
	void eat() {
		System.out.println("omnivores eat plants and meat");
	}
}
class carnivores extends Animal{
	void eat() {
	System.out.println("carnivores eat meat");	
	}
}
	

public class PolyRuntime1 {
	
	public static void main(String[] args) {
		Animal A=new Animal();
		A.eat();// Animal eats
		Animal h= new herbivores();
		h.eat();
		Animal o=new omnivores();
		o.eat();
		Animal c=new carnivores();
		c.eat();
		
		//when a method gets to know its implementation at the time of exeution/run time is known as run
		//time poly this can be achieved by using method overriding
		//1.Inheritance
		//2.upcasting
		//3.method overriding.
		

	}

}
