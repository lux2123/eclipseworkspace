package pyramids;

public class InvertHalfPyramid {
	
	void Invert() {
	for(int i=1;i<=5;i++) {
		for(int j=5; j>=i;j--) {
			System.out.print("* ");
		}
		System.out.println();
	
	}
	}

	public static void main(String[] args) {
		InvertHalfPyramid obj=new InvertHalfPyramid();
		obj.Invert();

	}

}
