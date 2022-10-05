package Interface;

interface i1{
	//variable---> by default--->public static final
	//method--->by default---->public abstract
	//no complete method/non-abstract
	//no constructor
}

interface Drawable{
	int salary=25000;//by default--->public static final int salary=25000;
	void draw();//by default--->public abtract void draw();
}
class rect implements Drawable{
	public void draw() {
		System.out.println("drawing rect");
	}
	
}
class circle implements Drawable{
	public void draw() {
		System.out.println("drawing circle");
	}
}
public class Interface01 {

	public static void main(String[] args) {
		System.out.println("int salary:"+Drawable.salary);
		Drawable d=new circle();
		d.draw();
		Drawable d2=new rect();
		d2.draw();

	}

}
