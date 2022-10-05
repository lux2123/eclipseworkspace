package pyramids;

public class HalfPyramidUsingAlphabet {
	
	void printHalfPyramidUsingAlphabet(int row) {
		char ch='A';
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(ch+" ");
			}
			System.out.println();
			ch++;
		}
	}

	public static void main(String[] args) {
		HalfPyramidUsingAlphabet obj=new HalfPyramidUsingAlphabet();
		obj.printHalfPyramidUsingAlphabet(6);

	}

}
