package pyramids;

public class pyramid001 {
	
	void pyaramid() {
		for(int i=0;i<6;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
	

			
		}
	}

	public static void main(String[] args) {
		pyramid001 ref=new pyramid001();
		ref.pyaramid();

	}

}
