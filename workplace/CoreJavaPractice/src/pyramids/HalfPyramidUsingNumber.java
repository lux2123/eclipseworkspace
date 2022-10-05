package pyramids;

public class HalfPyramidUsingNumber {
	
	void HalfPyramidUsingNumber(int row) {
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
	HalfPyramidUsingNumber obj=new HalfPyramidUsingNumber();
	obj.HalfPyramidUsingNumber(9);

	}

}
