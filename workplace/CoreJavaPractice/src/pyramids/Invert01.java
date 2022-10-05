package pyramids;

public class Invert01 {

	
	void Invert() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
	//write a program half pyramid using * but invert way
	
	public static void main(String[] args) {
		Invert01 obj=new Invert01();
		obj.Invert();
	

	}

}
