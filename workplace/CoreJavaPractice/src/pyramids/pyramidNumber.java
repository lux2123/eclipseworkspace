package pyramids;

public class pyramidNumber {
	
	void NumberPyramid(int row) {
		for(int i=0;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pyramidNumber ref=new pyramidNumber();
		ref.NumberPyramid(6);
		
		
		

	}

}
