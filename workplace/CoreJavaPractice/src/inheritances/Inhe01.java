package inheritances;

class AB {
	static int a=12;
	int b=30;
	double c=39.55;
	
}
class BC extends AB{
	static  int x=32;
	int y=45;
	double z=40;
	
}
class CD extends BC{
	static int p=10;
	int q=12;
	double r=40.2;
}





public class Inhe01 {
	
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

	public static void main(String[] args) {
		System.out.println("static member of class AB:"+AB.a);
		System.out.println("static member of class BC:"+BC.x);
		System.out.println("static member of class CD:"+CD.p);
		
		System.out.println("*********************access non static members*******************");
		AB a1=new AB();
		System.out.println("non static class AB:"+a1.b);
		System.out.println("non static class AB:"+a1.c);
		
		BC b1=new BC();
		System.out.println("non static class BC:"+b1.y);
		System.out.println("non static class BC:"+b1.z);
		CD c1=new CD();
		System.out.println("non static class CD:"+c1.q);
		System.out.println("non static class CD:"+c1.r);
		System.out.println("non static class CD:"+c1.y);
		System.out.println("non static class CD:"+c1.z);
		System.out.println("non static class CD:"+c1.b);
		System.out.println("non static class CD:"+c1.c);
		

		
		
		

	}

}
