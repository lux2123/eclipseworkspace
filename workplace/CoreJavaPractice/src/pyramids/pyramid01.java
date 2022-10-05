package pyramids;

public class pyramid01 {
	
	void pyramid() {
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
				
			
		}
	}

	public static void main(String[] args) {
		pyramid01 ref=new pyramid01();
		ref.pyramid();
		

	}

}
