package abstracts;

abstract class shape{
	abstract void draw();
}
class rectangle extends shape{
	protected void draw() {
		System.out.println("rectangle draw");
	}
}
class circle extends shape{
	public void draw() {
		System.out.println("circle draw");
	}
}
public class abstract03 {

	public static void main(String[] args) {
	shape s=new circle();
	s.draw();
	shape r=new rectangle();
	r.draw();

	}

}
